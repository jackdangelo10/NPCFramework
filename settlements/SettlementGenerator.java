package settlements;

import java.util.Random;
import characters.Family;
import characters.FamilyGenerator;
import civilizations.Civilization;
import structures.Farmstead;
import structures.Guardhouse;
import structures.Smithy;
import structures.Structure;
import structures.StructureGenerator;
import structures.AssemblyHall;
import structures.Workshop;

public class SettlementGenerator 
{
    private static Random random = new Random();
    private static FamilyGenerator familyGenerator = new FamilyGenerator();
    private static StructureGenerator structureGenerator = new StructureGenerator();

    public Settlement generateRandomSettlement(Civilization c)
    {
        double chance = Math.random();
        if(chance < .4)
        {
            return generateRandomHamlet(c);
        }
        else if(chance >= .4 && chance < .7)
        {
            return generateRandomVillage(c);
        }
        else if(chance >= .7 && chance < .9)
        {
            return generateRandomTown(c);
        }
        else if(chance >= .9 && chance <= 1)
        {
            return generateRandomCity(c);
        }
        else
        {
            return null;
        }
    }

/***SETTLEMENT GENERATION *********************************************************** */

    public Settlement generateRandomHamlet(Civilization c)
    {
        Settlement hamlet = new Hamlet(c);
        int structureCount = random.nextInt(hamlet.MAX_STRUCTURES - hamlet.MIN_STRUCTURES - 5) + hamlet.MIN_STRUCTURES;
        generateBaseStructures(hamlet);
        generateHamletTierStructures(hamlet, structureCount);


        return hamlet;
    }

    public Settlement generateRandomVillage(Civilization c)
    {
        Settlement village = new Village(c);
        int structureCount = random.nextInt(village.MAX_STRUCTURES - village.MIN_STRUCTURES - 5) + village.MIN_STRUCTURES;
        generateBaseStructures(village);
        generateVillageTierStructures(village, structureCount);

        return village;
    }

    public Settlement generateRandomTown(Civilization c)
    {
        Settlement town = new Town(c);
        int structureCount = random.nextInt(town.MAX_STRUCTURES - town.MIN_STRUCTURES - 5) + town.MIN_STRUCTURES;
        generateBaseStructures(town);
        generateTownTierStructures(town, structureCount);

        return town;
    }

    public Settlement generateRandomCity(Civilization c)
    {
        Settlement city = new City(c);
        int structureCount = random.nextInt(city.MAX_STRUCTURES - city.MIN_STRUCTURES - 5) + city.MIN_STRUCTURES;
        generateBaseStructures(city);
        generateCityTierStructures(city, structureCount);

        return city;
    }

/**AUXILARY GENERATION ************************************************************ */


    //generate structures and then people in the structures 

    private void generatePopulation(Settlement s, int popLeft)
    {
        while(popLeft > 0)
        {
            int familySize = random.nextInt(4) + 1;
            if(familySize > popLeft)
            {
                familySize = popLeft;
            }
            
            Family f = familyGenerator.generateFamily(familySize);
            
            s.getInhabitants().addAll(f.getMembers());
            s.getFamilies().add(f);
            popLeft -= familySize;
        }
    }

    private void generateBaseStructures(Settlement s)
    {
        for(Structure str : StructureGenerator.getBaseStructures())
        {
            s.getStructures().add(str.clone());
        }
    }

    private void generateHamletTierStructures(Settlement s, int count)
    {
        for(int i = 0; i < count; i++)
        {
            Structure str = structureGenerator.generateRandomHamletTierStructure();
            str.setSettlement(s);
            s.getStructures().add(str);
        }
    }

    private void generateVillageTierStructures(Settlement s, int count)
    {
        for(int i = 0; i < count; i++)
        {
            Structure str = structureGenerator.generateRandomVillageTierStructure();
            str.setSettlement(s);
            s.getStructures().add(str);
        }
    }

    private void generateTownTierStructures(Settlement s, int count)
    {
        for(int i = 0; i < count; i++)
        {
            Structure str = structureGenerator.generateRandomTownTierStructure();
            str.setSettlement(s);
            s.getStructures().add(str);
        }
    }

    private void generateCityTierStructures(Settlement s, int count)
    {
        for(int i = 0; i < count; i++)
        {
            Structure str = structureGenerator.generateRandomCityTierStructure();
            str.setSettlement(s);
            s.getStructures().add(str);
        }
    }
}