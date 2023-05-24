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

public class Breeder 
{
    private static Character male = null;
    private static Character female = null;
    private static Character offspring = null;
    private static Civilization civ = null;
    private static Settlement settlement = null;
    private static RelationshipFinder finder = new RelationshipFinder();

    public Breeder() {}

    public Breeder(Character p1, Character p2, Civilization c, Settlement s) 
        throws BadAttributeValueExpException
    {
        setCouple(p1, p2, c, s);
    }

    public void checkConditions(Character p1, Character p2) throws BadAttributeValueExpException
    {
        if(p1.getSex() == Sex.MALE && p2.getSex() == Sex.MALE)
        {
            throw new BadAttributeValueExpException("Both men");
        }
        if(p1.getSex() == Sex.FEMALE && p2.getSex() == Sex.FEMALE)
        {
            throw new BadAttributeValueExpException("Both women");
        }
        if(p1.getAge() == CharacterAttributes.Age.CHILD || p2.getAge() == CharacterAttributes.Age.CHILD)
        {
            throw new BadAttributeValueExpException("Ethan Paragus error");
        }
    }
    
    public void reset()
    {   
        male = null;
        female = null;
        offspring = null;
        civ = null;
        settlement = null;
    }

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

    public Character breed() throws BadAttributeValueExpException
    {
        if(male == null || female == null)
        {
            throw new BadAttributeValueExpException("Partners not set.");
        }
        inheritedStats();
        inheritedTraits();
        mutationTraits();

        //join family
        offspring.setFamily(female.getFamily());
        offspring.getFamily().addMember(offspring);
        offspring.setFather(male);
        offspring.setMother(female);

        male.addChild(offspring);
        female.addChild(offspring);

        return offspring;
    }

    private void mutationTraits()
    {
        Trait mutation = GeneticTraitGenerator.generateRandomTrait();

        if(mutation.getTraitName() != "Inbred");
        {
            offspring.addTrait(mutation);
        }
    }

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

        String s = finder.findFamilialRelationship(male, female);
        if(s != null && s != "Wife" && s != "Husband")
        {
            offspring.addTrait(new Inbred());
        }
        
    }

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
        offspring.setAssignedStructure(settlement.getHousing());
        settlement.getHousing().assignHouseholdMember(offspring);
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
