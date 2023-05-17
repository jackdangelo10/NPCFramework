package characters;

import characters.CharacterAttributes.Ideology;
import characters.CharacterAttributes.Mood;
import governments.GovernmentAttributes.CitizenshipLevel;
import helper.NormalRandom;
import professions.ProfessionGenerator;
import traits.Trait;
import traits.acquiredTraits.AcquiredTraitGenerator;
import traits.geneticTraits.GeneticTraitGenerator;

public class NPCGenerator 
{
    private static final NormalRandom rand20 = new NormalRandom(3, 10);
    private static final NormalRandom rand100 = new NormalRandom(3, 50);
    private static final NormalRandom rand5 = new NormalRandom(3, 5);

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
        npc.setProfession1(ProfessionGenerator.generateRandomProfession());
        npc.setProfession1Skill(rand100.randomNum(1, 100));
        npc.setCitizenshipLevel(CitizenshipLevel.randomCitizenshipLevel());
        npc.setFertility(rand100.randomNum(1, 100));
        npc.setHealth(100);
        npc.getIdentity().setIdl(Ideology.randomIdeology());
        npc = generateIdentity(npc);
        npc = generateGeneticTraits(npc);
        npc = generateAcquiredTraits(npc);
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
        return npc;
    }




/** TRAIT GENERATION ************************************************************************** */
    private NPC generateGeneticTraits(NPC npc)
    {
        for(Trait i : GeneticTraitGenerator.getList())
        {
            double num = Math.random(); 
            if(num < i.getChance())
            {
                npc.addTrait(i);
            }
        }
        return npc;
    }

    private NPC generateAcquiredTraits(NPC npc)
    {
        for(Trait i : AcquiredTraitGenerator.getList())
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

    private NPC generateIdentity(NPC npc)
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