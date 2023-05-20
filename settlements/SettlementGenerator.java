package settlements;

import java.util.Random;
import characters.Family;
import characters.FamilyGenerator;
import civilizations.Civilization;
import professions.ProfessionGenerator;
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
    private static ProfessionGenerator professionGenerator = new ProfessionGenerator();
    private int courthouseCount = 0;
    private int citadelCount = 0;
    private int holysiteCount = 0;
    private int monasteryCount = 0;
    private int castleCount = 0;
    private int palaceCount = 0;
    private int universityCount = 0;

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
        int structureCount = random.nextInt(hamlet.MAX_STRUCTURES - hamlet.MIN_STRUCTURES);
        generateBaseStructures(hamlet);
        generateHamletTierStructures(hamlet, structureCount);

        resetCounts();
        return hamlet;
    }

    public Settlement generateRandomVillage(Civilization c)
    {
        Settlement village = new Village(c);
        int structureCount = random.nextInt(village.MAX_STRUCTURES - village.MIN_STRUCTURES) + village.MIN_STRUCTURES - 5;
        generateBaseStructures(village);
        generateVillageTierStructures(village, structureCount);

        resetCounts();
        return village;
    }

    public Settlement generateRandomTown(Civilization c)
    {
        Settlement town = new Town(c);
        int structureCount = random.nextInt(town.MAX_STRUCTURES - town.MIN_STRUCTURES) + town.MIN_STRUCTURES - 5;
        generateBaseStructures(town);
        generateTownTierStructures(town, structureCount);

        resetCounts();
        return town;
    }

    public Settlement generateRandomCity(Civilization c)
    {
        Settlement city = new City(c);
        int structureCount = random.nextInt(city.MAX_STRUCTURES - city.MIN_STRUCTURES - 5) + city.MIN_STRUCTURES - 5;
        generateBaseStructures(city);
        generateCityTierStructures(city, structureCount);

        resetCounts();
        return city;
    }

/**AUXILARY GENERATION ************************************************************ */


    //generate structures and then people in the structures 

    private void generatePopulation(Settlement s)
    {
        
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
            if(checkStructureRepeats(s, str))
            {
                str.setSettlement(s);
                s.getStructures().add(str);
            }
        }
    }

    private void generateVillageTierStructures(Settlement s, int count)
    {
        for(int i = 0; i < count; i++)
        {
            Structure str = structureGenerator.generateRandomVillageTierStructure();
            if(checkStructureRepeats(s, str))
            {
                str.setSettlement(s);
                s.getStructures().add(str);
            }
        }
    }

    private void generateTownTierStructures(Settlement s, int count)
    {
        for(int i = 0; i < count; i++)
        {
            Structure str = structureGenerator.generateRandomTownTierStructure();
            if(checkStructureRepeats(s, str))
            {
                str.setSettlement(s);
                s.getStructures().add(str);
            }
        }
    }

    private void generateCityTierStructures(Settlement s, int count)
    {
        for(int i = 0; i < count; i++)
        {
            Structure str = structureGenerator.generateRandomCityTierStructure();
            if(checkStructureRepeats(s, str))
            {
                str.setSettlement(s);
                s.getStructures().add(str);
            }
        }
    }

    private boolean checkStructureRepeats(Settlement s, Structure str)
    {
        if(str.getStructureName() == "Courthouse")
        {
            if(courthouseCount < 1)
            {
                courthouseCount++;
                return true;
            }
            else
            {
                courthouseCount++;
                return false;
            }
            
        }

        if(str.getStructureName() == "Citadel")
        {
            if(citadelCount < 1)
            {
                citadelCount++;
                return true;
            }
            else
            {
                citadelCount++;
                return false;
            }
        }

        if(str.getStructureName() == "Holy Site")
        {
            if(holysiteCount < 1)
            {
                holysiteCount++;
                return true;
            }
            else
            {
                holysiteCount++;
                return false;
                
            }
        }

        if(str.getStructureName() == "Monastery")
        {
            if(monasteryCount < 1)
            {
                monasteryCount++;
                return true;
            }
            else
            {
                monasteryCount++;
                return false;
            }
        }

        if(str.getStructureName() == "University")
        {
            if(universityCount < 1)
            {
                universityCount++;
                return true;
            }
            else
            {
                universityCount++;
                return false;
            }
        }

        if(str.getStructureName() == "Castle")
        {
            if(castleCount < 1)
            {
                castleCount++;
                return true;
            }
            else
            {
                castleCount++;
                return false;
            }
        }

        if(str.getStructureName() == "Palace")
        {
            if(palaceCount < 1)
            {
                palaceCount++;
                return true;
            }
            else
            {
                palaceCount++;
                return false;
            }
        }
        return true;
    }

    private void resetCounts()
    {
        courthouseCount = 0;
        citadelCount = 0;
        holysiteCount = 0;
        monasteryCount = 0;
        castleCount = 0;
        palaceCount = 0;
        universityCount = 0;
    }
}