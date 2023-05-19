package structures;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import civilizations.Civilization;
import settlements.Settlement;

public class StructureGenerator 
{
    private static List<Structure> structures = new ArrayList<Structure>();
    private static List<Structure> baseStructures = new ArrayList<Structure>();
    private static List<Structure> hamletTierStructures = new ArrayList<Structure>();
    private static List<Structure> villageTierStructures = new ArrayList<Structure>();
    private static List<Structure> townTierStructures = new ArrayList<Structure>();
    private static List<Structure> cityTierStructures = new ArrayList<Structure>();
    private static Random random = new Random();

    public StructureGenerator(Civilization c, Settlement s)
    {
        structures.clear();
        baseStructures.clear();
        hamletTierStructures.clear();
        villageTierStructures.clear();
        townTierStructures.clear();
        cityTierStructures.clear();

        Structure bank = new Bank(c, s);
        Structure barracks = new Barracks(c, s);
        Structure castle = new Castle(c, s);
        Structure courthouse = new Courthouse(c,s);
        Structure dock = new Dock(c, s);
        Structure farmstead = new Farmstead(c, s);
        Structure forge = new Forge(c, s);
        Structure granary = new Granary(c, s);
        Structure guardhouse = new Guardhouse(c, s);
        Structure guildhall = new Guildhall(c, s);
        Structure house = new House(c, s);
        Structure library = new Library(c, s);
        Structure lumbermill = new LumberMill(c, s);
        Structure mine = new Mine(c,s);
        Structure monastery = new Monastery(c, s);
        Structure palace = new Palace(c, s);
        Structure pasture = new Pasture(c, s);
        Structure quarry = new Quarry(c, s);
        Structure shop = new Shop(c, s);
        Structure shrine = new Shrine(c, s);
        Structure smithy = new Smithy(c, s);
        Structure stables = new Stables(c, s);
        Structure tavern = new Tavern(c, s);
        Structure assemblyhall = new AssemblyHall(c, s);
        Structure workshop = new Workshop(c, s);
        Structure citadel = new Citadel(c, s);
        Structure temple = new Temple(c, s);
        Structure alchemylab = new AlchemyLabratory(c, s);
        Structure windmill = new Windmill(c, s);
        Structure winepress = new WinePress(c, s);
        Structure loomhouse = new LoomHouse(c, s);
        Structure emporium = new Emporium(c, s);
        Structure university = new University(c, s);
        Structure scriptorium = new Scriptorium(c, s);
        Structure watermill = new Watermill(c, s);
        Structure harbor = new Harbor(c, s);
        Structure brewery = new Brewery(c, s);
        Structure port = new Port(c, s);
        Structure holysite = new HolySite(c, s);

        baseStructures.add(workshop);
        baseStructures.add(guardhouse);
        baseStructures.add(assemblyhall);
        baseStructures.add(farmstead);
        baseStructures.add(smithy);

        hamletTierStructures.add(house);
        hamletTierStructures.add(pasture);
        hamletTierStructures.add(shop);
        hamletTierStructures.add(granary);
        hamletTierStructures.add(shrine);
        hamletTierStructures.add(dock);
        hamletTierStructures.add(stables);

        villageTierStructures.add(granary);
        villageTierStructures.add(forge);
        villageTierStructures.add(library);
        villageTierStructures.add(mine);
        villageTierStructures.add(monastery);
        villageTierStructures.add(quarry);
        villageTierStructures.add(tavern);
        villageTierStructures.add(windmill);
        villageTierStructures.add(watermill);

        townTierStructures.add(castle);
        townTierStructures.add(harbor);
        townTierStructures.add(courthouse);
        townTierStructures.add(guildhall);
        townTierStructures.add(temple);
        townTierStructures.add(brewery);
        townTierStructures.add(winepress);
        townTierStructures.add(loomhouse);
        townTierStructures.add(scriptorium);
        townTierStructures.add(guildhall);

        cityTierStructures.add(palace);
        cityTierStructures.add(port);
        cityTierStructures.add(citadel);
        cityTierStructures.add(university);
        cityTierStructures.add(holysite);
        cityTierStructures.add(alchemylab);
        cityTierStructures.add(emporium);
        cityTierStructures.add(bank);

        structures.addAll(baseStructures);
        structures.addAll(hamletTierStructures);
        structures.addAll(villageTierStructures);
        structures.addAll(townTierStructures);
        structures.addAll(cityTierStructures);

    }

    public Structure generateRandomStructure()
    {
        if(structures.isEmpty()) 
        {
            return null;
        }
        
        int index = random.nextInt(structures.size());
        return structures.get(index).clone();
    }

    public Structure generateRandomHamletTierStructure()
    {
        if(hamletTierStructures.isEmpty())
        {
            return null;
        }
        int index = random.nextInt(hamletTierStructures.size());
        return hamletTierStructures.get(index).clone();
    }

    public Structure generateRandomVillageTierStructure()
    {
        if(villageTierStructures.isEmpty())
        {
            return null;
        }
        int index = random.nextInt(villageTierStructures.size());
        return villageTierStructures.get(index).clone();
    }

    public Structure generateRandomTownTierStructure()
    {
        if(townTierStructures.isEmpty())
        {
            return null;
        }
        int index = random.nextInt(townTierStructures.size());
        return townTierStructures.get(index).clone();
    }

    public Structure generateRandomCityTierStructure()
    {
        if(cityTierStructures.isEmpty())
        {
            return null;
        }
        int index = random.nextInt(cityTierStructures.size());
        return cityTierStructures.get(index).clone();
    }

    public List<Structure> getList()
    {
        return structures;
    }  

}
