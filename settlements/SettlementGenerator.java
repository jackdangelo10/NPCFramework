package settlements;

import java.util.Random;
import characters.Family;
import characters.FamilyGenerator;
import civilizations.Civilization;
import structures.Farmstead;
import structures.Guardhouse;
import structures.Smithy;
import structures.Structure;
import structures.AssemblyHall;
import structures.Workshop;

public class SettlementGenerator 
{
    private static Random random = new Random();
    private static FamilyGenerator familyGenerator = new FamilyGenerator();

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
        int popLeft = random.nextInt(hamlet.getMAX_POP() - hamlet.getMIN_POP()) + hamlet.getMIN_POP();
        generatePopulation(hamlet, popLeft);



        return hamlet;
    }

    public Settlement generateRandomVillage(Civilization c)
    {
        Settlement village = new Village(c);
        int popLeft = random.nextInt(village.getMAX_POP() - village.getMIN_POP()) + village.getMIN_POP();   
        generatePopulation(village, popLeft);

        return village;
    }

    public Settlement generateRandomTown(Civilization c)
    {
        Settlement town = new Town(c);
        int popLeft = random.nextInt(town.getMAX_POP() - town.getMIN_POP()) + town.getMIN_POP();   
        generatePopulation(town, popLeft);

        return town;
    }

    public Settlement generateRandomCity(Civilization c)
    {
        Settlement city = new City(c);
        int popLeft = random.nextInt(city.getMAX_POP() - city.getMIN_POP()) + city.getMIN_POP(); 
        generatePopulation(city, popLeft);  

        return city;
    }

/**AUXILARY GENERATION ************************************************************ */

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
        s.getStructures().add(new Workshop(null, s));
        s.getStructures().add(new Guardhouse(null, s));
        s.getStructures().add(new AssemblyHall(null, s));
        s.getStructures().add(new Farmstead(null, s));
        s.getStructures().add(new Smithy(null, s));
    }

    private void generateHamletTierStructures(Settlement s)
    {

    }

    private void generateVillageTierStructures(Settlement s)
    {

    }

    private void generateTownTierStructures(Settlement s)
    {

    }

    private void generateCityTierStructures(Settlement s)
    {

    }
}