package settlements;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import characters.Family;
import characters.FamilyGenerator;
import characters.CharacterAttributes.Age;
import civilizations.Civilization;
import professions.ProfessionAssignmentScheduler;
import professions.ProfessionGenerator;
import resources.Resource;
import resources.ResourceGenerator;
import structures.Farmstead;
import structures.Guardhouse;
import structures.Smithy;
import structures.Structure;
import structures.StructureGenerator;
import structures.AssemblyHall;
import structures.Workshop;
import structures.StructureAttributes.ProductionTag;


//REORGANIZE SO THAT RESOURCES CAN BE PASSED TO SETTLEMENT TO START AND IF THEY ARE MISSING A CORE BUILDING IT FILLS IT IN

public class SettlementGenerator 
{
    private static Random random = new Random();
    private static FamilyGenerator familyGenerator = new FamilyGenerator();
    private static StructureGenerator structureGenerator = new StructureGenerator();
    private static ProfessionAssignmentScheduler professionAssignmentScheduler = new ProfessionAssignmentScheduler();
    private static ResourceGenerator resourceGenerator = new ResourceGenerator();
    private int courthouseCount = 0;
    private int citadelCount = 0;
    private int holysiteCount = 0;
    private int monasteryCount = 0;
    private int castleCount = 0;
    private int palaceCount = 0;
    private int universityCount = 0;
    private final int BASE_STRUCTURE_COUNT = 5;

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
        generateResourceStructures(resourceGenerator.generateRandomResourceSpawn(), hamlet);
        generateBaseStructures(hamlet);
        generateHamletTierStructures(hamlet, structureCount);
        generatePopulation(hamlet);
        hamlet.setUnemployed(professionAssignmentScheduler.schedule(hamlet.getUnemployed(), hamlet.getStructures(), ProductionTag.BALANCED));
        assignHousing(hamlet);


        initialize(hamlet);
        resetCounts();
        return hamlet;
    }

    public Settlement generateRandomVillage(Civilization c)
    {
        Settlement village = new Village(c);
        int structureCount = random.nextInt(village.MAX_STRUCTURES - village.MIN_STRUCTURES) + village.MIN_STRUCTURES - BASE_STRUCTURE_COUNT;
        generateResourceStructures(resourceGenerator.generateRandomResourceSpawn(), village);
        generateBaseStructures(village);
        generateVillageTierStructures(village, structureCount);
        generatePopulation(village);
        village.setUnemployed(professionAssignmentScheduler.schedule(village.getUnemployed(), village.getStructures(), ProductionTag.BALANCED));
        assignHousing(village);

        initialize(village);
        resetCounts();
        return village;
    }

    public Settlement generateRandomTown(Civilization c)
    {
        Settlement town = new Town(c);
        int structureCount = random.nextInt(town.MAX_STRUCTURES - town.MIN_STRUCTURES) + town.MIN_STRUCTURES - BASE_STRUCTURE_COUNT;
        generateResourceStructures(resourceGenerator.generateRandomResourceSpawn(), town);
        generateBaseStructures(town);
        generateTownTierStructures(town, structureCount);
        generatePopulation(town);
        town.setUnemployed(professionAssignmentScheduler.schedule(town.getUnemployed(), town.getStructures(), ProductionTag.BALANCED));
        assignHousing(town);

        initialize(town);
        resetCounts();
        return town;
    }

    public Settlement generateRandomCity(Civilization c)
    {
        Settlement city = new City(c);
        int structureCount = random.nextInt(city.MAX_STRUCTURES - city.MIN_STRUCTURES - 5) + city.MIN_STRUCTURES - BASE_STRUCTURE_COUNT;
        generateResourceStructures(resourceGenerator.generateRandomResourceSpawn(), city);
        generateBaseStructures(city);
        generateCityTierStructures(city, structureCount);
        generatePopulation(city);
        city.setUnemployed(professionAssignmentScheduler.schedule(city.getUnemployed(), city.getStructures(), ProductionTag.BALANCED));
        assignHousing(city);

        initialize(city);
        resetCounts();
        return city;
    }


/**POPULATION GENERATION ************************************************************ */


    //generate structures and then people in the structures 

    private void generatePopulation(Settlement s)
    {
        int familyCount = s.getStructures().size();
        for(int i = 0; i < familyCount; i++)
        {
            Family f = familyGenerator.generateFamily();
            for(characters.Character c : f.getMembers())
            {
                if(c.getAge() == Age.ADULT)
                {
                    s.getUnemployed().add(c);
                }
                s.getInhabitants().add(c);
            }
            f.setFamilyName(f.getMembers().get(0).getLastName());
            s.getFamilies().add(f);
        }
    }

/**UNEMPLOYED HOUSING ************************************************************* */

    private void assignHousing(Settlement s)
    {
        if(s.getUnemployed() == null || s.getUnemployed().isEmpty())
        {
            return;
        }
        int numberOfHousesNeeded = (int)(Math.ceil(s.getUnemployed().size() / 10));
        if(numberOfHousesNeeded == 0)
        {
            s.getHousing().addAll(s.getUnemployed());;
        }
        int numberOfHousesProvided = numberOfHousesNeeded + random.nextInt(4) - 1;
        for(int i = 0; i < numberOfHousesProvided; i++)
        {
            s.getHousing().addHouse();
        }
        s.setUnhoused(s.getHousing().addAll(s.getUnemployed()));
    }


/**STRUCTURE GENERATION **************************************************************** */

    private void generateBaseStructures(Settlement s)
    {
        for(Structure str : StructureGenerator.getBaseStructures())
        {
            //already a farmstead generated from the resources
            if(str.getStructureName() != "Farmstead")
            {
                s.getStructures().add(str.clone());
            } 
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

    private void generateResourceStructures(List<Resource> resources, Settlement s)
    {
        for(Resource r : resources)
        {
            String structureName = r.getAssociatedStructure();
            Structure str = structureGenerator.getStructureFromMap(structureName);
            str.setSettlement(s);
            s.getStructures().add(str);
            s.getEconomy().addResource(r);
            s.getEconomy().addResourceStructurePairing(r, str);
            s.getEconomy().setSettlement(s);
        }
    }

    private void initialize(Settlement s)
    {
        s.getEconomy().updateOutputs();
    }
}