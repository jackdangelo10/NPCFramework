package characters;

import characters.CharacterAttributes.Ideology;
import characters.CharacterAttributes.Mood;
import characters.CharacterAttributes.Sex;
import governments.GovernmentAttributes.CitizenshipLevel;
import helper.NormalRandom;
import traits.Trait;
import traits.acquiredTraits.AcquiredTraitGenerator;
import traits.geneticTraits.GeneticTraitGenerator;

/**
 * Generates NPCs for game
 */
public class NPCGenerator 
{
    private static final NormalRandom rand20 = new NormalRandom(3, 10);
    private static final NormalRandom rand100 = new NormalRandom(3, 50);
    private static final NormalRandom rand5 = new NormalRandom(3, 5);
    private static final GeneticTraitGenerator gtg = new GeneticTraitGenerator();
    private static final AcquiredTraitGenerator atg = new AcquiredTraitGenerator();
    private static final CharacterNameGenerator cng = new CharacterNameGenerator();

    /**
     * @return completely random NPC weighted so that adults are more likely
     */
    public NPC generateRandomNPC()
    {
        if(Math.random() > .2)
        {
            return generateRandomAdultNPC();
        }
        else
        {
            return generateRandomChildNPC();
        }
    }

    /**
     * @param sex of NPC
     * @return randomly generated adult NPC with assigned sex
     */
    public NPC generateRandomAdultNPC(CharacterAttributes.Sex sex)
    {
        NPC npc = generateRandomAdultNPC();
        npc.setSex(sex);
        return npc;
    }

    /**
     * @return randomly generated adult NPC
     */
    public NPC generateRandomAdultNPC()
    {
        NPC npc = new NPC();
        npc.setSTR(rand20.randomNum(1, 20));
        npc.setCON(rand20.randomNum(1, 20));
        npc.setDEX(rand20.randomNum(1, 20));
        npc.setINT(rand20.randomNum(1, 20));
        npc.setPER(rand20.randomNum(1, 20));
        npc.setCHR(rand20.randomNum(1, 20));
        npc.setLCK(rand20.randomNum(1, 20));
        npc.setGFT(rand20.randomNum(1, 20));
        npc.setBaseReputation(rand100.randomNum(1, 100));
        npc.setBaseSway(rand100.randomNum(1, 100));
        npc.setAge(CharacterAttributes.Age.ADULT);
        npc.setCitizenshipLevel(CitizenshipLevel.randomCitizenshipLevel());
        npc.setFertility(rand100.randomNum(1, 100));
        npc.setHealth(100);
        
        npc.getIdentity().setIdl(Ideology.randomIdeology());
        npc = generateIdentity(npc);
        npc = generateGeneticTraits(npc);
        npc = generateAcquiredTraits(npc);
        if(Math.random() > .5)
        {
            npc.setSex(Sex.FEMALE);
        }
        else
        {
            npc.setSex(Sex.MALE);
        }
        npc.setName(cng.createName());
        npc.setFather(Adam.getInstance());
        npc.setMother(Eve.getInstance());
        return npc;
    }

    /**
     * @param sex of NPC
     * @return randomly generated child NPC with assigned sex
     */
    public NPC generateRandomChildNPC(CharacterAttributes.Sex sex)
    {
        NPC npc = generateRandomChildNPC();
        npc.setSex(sex);
        return npc;
    }

    public NPC generateRandomChildNPC()
    {
        NPC npc = new NPC();

        npc.setSTR(rand5.randomNum(1, 10));
        npc.setCON(rand5.randomNum(1, 10));
        npc.setDEX(rand5.randomNum(1, 10));
        npc.setINT(rand5.randomNum(1, 10));
        npc.setPER(rand5.randomNum(1, 10));
        npc.setCHR(rand5.randomNum(1, 10));
        npc.setLCK(rand5.randomNum(1, 10));
        npc.setGFT(rand5.randomNum(1, 10));
        npc.setBaseReputation(0);
        npc.setBaseSway(0);
        npc.setAge(CharacterAttributes.Age.CHILD);
        npc.setCitizenshipLevel(CitizenshipLevel.MINOR);
        npc.setFertility(0);
        npc.setHealth(100);
        npc = generateGeneticTraits(npc);
        npc.getIdentity().setIdl(Ideology.APOLITICAL);
        npc = generateIdentity(npc);
        if(Math.random() > .5)
        {
            npc.setSex(Sex.FEMALE);
        }
        else
        {
            npc.setSex(Sex.MALE);
        }
        npc.setName(cng.createName());
        npc.setFather(Adam.getInstance());
        npc.setMother(Eve.getInstance());
        return npc;
    }


/** TRAIT GENERATION ************************************************************************** */
    
    /**
     * has chance of assigning each genetic trait to npc
     * @param npc to generate traits for
     * @return the NPC with its newly assigned traits
     */
    private static NPC generateGeneticTraits(NPC npc)
    {
        for(Trait i : gtg.getList())
        {
            double num = Math.random(); 
            if(num < i.getChance())
            {
                npc.addTrait(i);
            }
        }
        return npc;
    }

    /**
     * has chance of assigning each acquired trait to npc
     * @param npc to generate traits for
     * @return the NPC with its newly assigned traits
     */
    private static NPC generateAcquiredTraits(NPC npc)
    {
        for(Trait i : atg.getList())
        {
            double num = Math.random(); 
            if(num < i.getChance())
            {
                npc.addTrait(i);
            }
        }
        return npc;
    }
/**IDENTITY GENERATION ******************************************************************** */

    //generates randomized identity for NPC
    private static NPC generateIdentity(NPC npc)
    {
        npc.getIdentity().setMd(Mood.randomMood());
        npc.getIdentity().setAgreeableness(rand100.randomNum(1, 100));
        npc.getIdentity().setConscientiousness(rand100.randomNum(1, 100));
        npc.getIdentity().setExtraversion(rand100.randomNum(1, 100));
        npc.getIdentity().setNeuroticism(rand100.randomNum(1, 100));
        npc.getIdentity().setOpenness(rand100.randomNum(1, 100));
        return npc;
    }

}
