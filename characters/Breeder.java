package characters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.management.BadAttributeValueExpException;
import characters.CharacterAttributes.Sex;
import civilizations.Civilization;
import governments.GovernmentAttributes.CitizenshipLevel;
import helper.NormalRandom;
import helper.SetLogic;
import settlements.Settlement;
import traits.Trait;
import traits.geneticTraits.GeneticTraitGenerator;
import traits.geneticTraits.neutralGeneticTraits.Inbred;


/**
 * class which takes a male and female character and produces
 * an offspring character which inherits their traits/stats
 */
public class Breeder 
{
    private static Character male = null;
    private static Character female = null;
    private static Character offspring = null;
    private static Civilization civ = null;
    private static Settlement settlement = null;
    private static RelationshipFinder finder = new RelationshipFinder();

    public Breeder() {}

    /**
     * constructor that assigns necessary values
     * @param p1 - mate candidate #1
     * @param p2 - mate candidate #2
     * @param c - civilization that the offspring will belong to
     * @param s - settlement that the offspring will belong to
     * @throws BadAttributeValueExpException
     */
    public Breeder(Character p1, Character p2, Civilization c, Settlement s) 
        throws BadAttributeValueExpException
    {
        setCouple(p1, p2, c, s);
    }

    /**
     * Makes sure that two characters are capable of reproduction
     * @param p1 - mate candidate #1
     * @param p2 c
     * @throws BadAttributeValueExpException
     */
    public void checkConditions(Character p1, Character p2) throws BadAttributeValueExpException
    {
        if(p1.getSex() == Sex.MALE && p2.getSex() == Sex.MALE)
        {
            throw new BadAttributeValueExpException("Two men cannot reproduce");
        }
        if(p1.getSex() == Sex.FEMALE && p2.getSex() == Sex.FEMALE)
        {
            throw new BadAttributeValueExpException("Two women cannot reproduce");
        }
        if(p1.getAge() == CharacterAttributes.Age.CHILD || p2.getAge() == CharacterAttributes.Age.CHILD)
        {
            throw new BadAttributeValueExpException("Children cannot reproduce");
        }
    }
    
    /**
     * resets variables to default
     */
    public void reset()
    {   
        male = null;
        female = null;
        offspring = null;
        civ = null;
        settlement = null;
    }

    /**
     * sets the couple that will produce offspring
     * checks necessary conditions before assignment
     * @param p1 - mate candidate #1
     * @param p2 - mate candidate #2
     * @param c - civilization of offspring
     * @param s - settlement of offspring
     * @throws BadAttributeValueExpException
     */
    public void setCouple(Character p1, Character p2, Civilization c, Settlement s) throws BadAttributeValueExpException
    {
        try
        {
            checkConditions(p1, p2);
            civ = c;
            settlement = s;

            if(p1.getSex() == Sex.MALE)
            {
                male = p1;
                female = p2;
            }
            else
            {
                male = p2;
                female = p1;
            }
            offspring = null;
        }
        catch(BadAttributeValueExpException e)
        {
            System.out.println(e.toString());
        }
        
    }

    /**
     * causes couple to produce an offspring
     * calls functions necessary for offspring's generation as a combination
     * of the two parents
     * @return the offspring produced by the 
     * @throws BadAttributeValueExpException
     */
    public Character breed() throws BadAttributeValueExpException
    {
        if(male == null || female == null)
        {
            throw new BadAttributeValueExpException("Partners not set.");
        }

        //combines stats/traits of parents
        inheritedStats();
        inheritedTraits();

        //offspring gets one random trait
        mutationTraits();

        //joins the family of his parents
        offspring.setFamily(female.getFamily());
        offspring.getFamily().addMember(offspring);
        offspring.setFather(male);
        offspring.setMother(female);

        male.addChild(offspring);
        female.addChild(offspring);

        return offspring;
    }

    /**
     * generate one random valid trait to add to offspring
     */
    private void mutationTraits()
    {
        Trait mutation = GeneticTraitGenerator.generateRandomTrait();

        if(mutation.getTraitName() != "Inbred");
        {
            offspring.addTrait(mutation);
        }
    }


    /**
     * process of inheriting traits from parents. Uses set logic: 
     * if both parents have trait more likely to get trait than if only one
     */
    private void inheritedTraits()
    {
        SetLogic setFactory = new SetLogic();
        ArrayList<String> maleList = new ArrayList<String>();
        ArrayList<String> femaleList = new ArrayList<String>();

        Map<String, Trait> traitPool = new HashMap<>(male.getTraits());
        traitPool.putAll(female.getTraits());

        maleList.addAll(male.getTraits().keySet());
        femaleList.addAll(female.getTraits().keySet());

        ArrayList<String> traitXOR = setFactory.exclusiveOr(maleList, femaleList);
        ArrayList<String> traitIntersection = setFactory.intersection(maleList, 
            femaleList);
        for(int i = 0; i < traitIntersection.size(); i++)
        {
            Trait tr = traitPool.get(traitIntersection.get(i));
            
            male.getTraits().get(traitIntersection.get(i));
            if(tr.getTraitName() == "Dwarf" || tr.getTraitName() == "Giant")
            {
                if(Math.random() > .5)
                {
                    offspring.addTrait(tr);
                }
            }
            else if(Math.random() > .25 && tr.isInheritable())
            {
                offspring.addTrait(tr);
            }
        }
        for(int i = 0; i < traitXOR.size(); i++)
        {
            Trait tr = traitPool.get(traitXOR.get(i));
            if(Math.random() > .66 && tr.isInheritable()) ///***important to add check for opposite trait */
            {
                offspring.addTrait(tr);
            }
        }

        //checks if two characters are related by blood
        String s = finder.findFamilialRelationship(male, female);
        if(s != null && s != "Wife")
        {
            System.out.println("Inbred relationship is " + s);
            offspring.addTrait(new Inbred());
        }
        
    }

    /**
     * assigns the stats of the offspring
     */
    private void inheritedStats()
    {
        NormalRandom rand = new NormalRandom(1, 0);
        offspring = new NPC();
        offspring.setSTR(weightedAverageHigh(male.getSTR(), female.getSTR()) + 
            rand.randomNum(-2,2));
        offspring.setCON(weightedAverageHigh(male.getCON(), female.getCON()) + 
            rand.randomNum(-2,2));
        offspring.setDEX(weightedAverageHigh(male.getDEX(), female.getDEX()) + 
            rand.randomNum(-2,2));
        offspring.setINT(weightedAverageHigh(male.getINT(), female.getINT()) + 
            rand.randomNum(-2,2));
        offspring.setPER(weightedAverageHigh(male.getPER(), female.getPER()) + 
            rand.randomNum(-2,2));
        offspring.setCHR(weightedAverageHigh(male.getCHR(), female.getCHR()) + 
            rand.randomNum(-2,2));
        offspring.setLCK(weightedAverageHigh(male.getLCK(), female.getLCK()) + 
            rand.randomNum(-2,2));
        offspring.setGFT(weightedAverageHigh(male.getGFT(), female.getGFT()) + 
            rand.randomNum(-2,2));
        offspring.setFertility(0);
        offspring.setBaseReputation(0);
        offspring.setBaseSway(50);
        offspring.setTurnAge(0);
        offspring.setAge(CharacterAttributes.Age.CHILD);
        offspring.setCiv(civ);
        offspring.setSettlement(settlement);
        offspring.setCitizenshipLevel(CitizenshipLevel.MINOR);
        offspring.setLastName(female.getLastName());
        offspring.setFirstName(CharacterNameGenerator.createFirstName());

        if(Math.random() > .5)
        {
            offspring.setSex(Sex.MALE);
        }
        else
        {
            offspring.setSex(Sex.FEMALE);
        }
    }

    /**
     * weighs the average of the parents' stats so that the numbers
     * are lower as appropriate for a child character
     * @param stat1
     * @param stat2
     * @return new stat for offspring
     */
    private int weightedAverageHigh(int stat1, int stat2)
    {
        double num = 0;
        if(stat1 >= stat2)
        {
            num = .66*(double)stat1 + .33*(double)stat2;
        }
        else
        {
            num = .33*(double)stat1 + .66*(double)stat2;
        }
        return (int)(num / 2);
    } 
}
