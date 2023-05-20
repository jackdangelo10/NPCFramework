package structures;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class StructureGenerator 
{
    private static List<Structure> structures = new ArrayList<Structure>();
    private static List<Structure> baseStructures = new ArrayList<Structure>();
    private static List<Structure> hamletTierStructures = new ArrayList<Structure>();
    private static List<Structure> villageTierStructures = new ArrayList<Structure>();
    private static List<Structure> townTierStructures = new ArrayList<Structure>();
    private static List<Structure> cityTierStructures = new ArrayList<Structure>();
    private static Random random = new Random();
    private static Map<String, Structure> structureMap = new HashMap<String, Structure>();

    public StructureGenerator()
    {
        structures.clear();
        baseStructures.clear();
        hamletTierStructures.clear();
        villageTierStructures.clear();
        townTierStructures.clear();
        cityTierStructures.clear();

        Structure bank = new Bank();
        Structure barracks = new Barracks();
        Structure castle = new Castle();
        Structure courthouse = new Courthouse();
        Structure dock = new Dock();
        Structure farmstead = new Farmstead();
        Structure forge = new Forge();
        Structure granary = new Granary();
        Structure guardhouse = new Guardhouse();
        Structure guildhall = new Guildhall();
        Structure house = new House();
        Structure library = new Library();
        Structure lumbermill = new LumberMill();
        Structure mine = new Mine();
        Structure monastery = new Monastery();
        Structure palace = new Palace();
        Structure pasture = new Pasture();
        Structure quarry = new Quarry();
        Structure shop = new Shop();
        Structure shrine = new Shrine();
        Structure smithy = new Smithy();
        Structure stables = new Stables();
        Structure tavern = new Tavern();
        Structure assemblyhall = new AssemblyHall();
        Structure workshop = new Workshop();
        Structure citadel = new Citadel();
        Structure temple = new Temple();
        Structure alchemylab = new AlchemyLabratory();
        Structure windmill = new Windmill();
        Structure winepress = new WinePress();
        Structure loomhouse = new LoomHouse();
        Structure emporium = new Emporium();
        Structure university = new University();
        Structure scriptorium = new Scriptorium();
        Structure watermill = new Watermill();
        Structure harbor = new Harbor();
        Structure brewery = new Brewery();
        Structure port = new Port();
        Structure holysite = new HolySite();

        structureMap.put("Bank", bank);
        structureMap.put("Barracks", barracks);
        structureMap.put("Castle", castle);
        structureMap.put("Courthouse", courthouse);
        structureMap.put("Dock", dock);
        structureMap.put("Farmstead", farmstead);
        structureMap.put("Forge", forge);
        structureMap.put("Granary", granary);
        structureMap.put("Guardhouse", guardhouse);
        structureMap.put("Guildhall", guildhall);
        structureMap.put("House", house);
        structureMap.put("Library", library);
        structureMap.put("Lumbermill", lumbermill);
        structureMap.put("Mine", mine);
        structureMap.put("Monastery", monastery);
        structureMap.put("Palace", palace);
        structureMap.put("Pasture", pasture);
        structureMap.put("Quarry", quarry);
        structureMap.put("Shop", shop);
        structureMap.put("Shrine", shrine);
        structureMap.put("Smithy", smithy);
        structureMap.put("Stables", stables);
        structureMap.put("Tavern", tavern);
        structureMap.put("Assembly Hall", assemblyhall);
        structureMap.put("Workshop", workshop);
        structureMap.put("Citadel", citadel);
        structureMap.put("Temple", temple);
        structureMap.put("Alchemy Labratory", alchemylab);
        structureMap.put("Windmill", windmill);
        structureMap.put("Wine Press", winepress);
        structureMap.put("Loomhouse", loomhouse);
        structureMap.put("Emporium", emporium);
        structureMap.put("University", university);
        structureMap.put("Scriptorium", scriptorium);
        structureMap.put("Watermill", watermill);
        structureMap.put("Harbor", harbor);
        structureMap.put("Brewery", brewery);
        structureMap.put("Port", port);
        structureMap.put("Holy Site", holysite);


        baseStructures.add(workshop);
        baseStructures.add(guardhouse);
        baseStructures.add(assemblyhall);
        baseStructures.add(farmstead);
        baseStructures.add(smithy);

        hamletTierStructures.add(pasture);
        hamletTierStructures.add(shop);
        hamletTierStructures.add(granary);
        hamletTierStructures.add(shrine);
        hamletTierStructures.add(dock);
        hamletTierStructures.add(stables);
        hamletTierStructures.add(farmstead);
        hamletTierStructures.add(workshop);
        hamletTierStructures.add(smithy);
        hamletTierStructures.add(guardhouse);

        villageTierStructures.add(granary);
        villageTierStructures.add(forge);
        villageTierStructures.add(library);
        villageTierStructures.add(mine);
        villageTierStructures.add(monastery);
        villageTierStructures.add(quarry);
        villageTierStructures.add(tavern);
        villageTierStructures.add(windmill);
        villageTierStructures.add(watermill);
        villageTierStructures.addAll(hamletTierStructures);

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
        townTierStructures.addAll(villageTierStructures);

        cityTierStructures.add(palace);
        cityTierStructures.add(port);
        cityTierStructures.add(citadel);
        cityTierStructures.add(university);
        cityTierStructures.add(holysite);
        cityTierStructures.add(alchemylab);
        cityTierStructures.add(emporium);
        cityTierStructures.add(bank);
        cityTierStructures.addAll(townTierStructures);

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

    public static List<Structure> getStructures() {
        return structures;
    }

    public static void setStructures(List<Structure> structures) {
        StructureGenerator.structures = structures;
    }

    public static List<Structure> getBaseStructures() {
        return baseStructures;
    }

    public static void setBaseStructures(List<Structure> baseStructures) {
        StructureGenerator.baseStructures = baseStructures;
    }

    public static List<Structure> getHamletTierStructures() {
        return hamletTierStructures;
    }

    public static void setHamletTierStructures(List<Structure> hamletTierStructures) {
        StructureGenerator.hamletTierStructures = hamletTierStructures;
    }

    public static List<Structure> getVillageTierStructures() {
        return villageTierStructures;
    }

    public static void setVillageTierStructures(List<Structure> villageTierStructures) {
        StructureGenerator.villageTierStructures = villageTierStructures;
    }

    public static List<Structure> getTownTierStructures() {
        return townTierStructures;
    }

    public static void setTownTierStructures(List<Structure> townTierStructures) {
        StructureGenerator.townTierStructures = townTierStructures;
    }

    public static List<Structure> getCityTierStructures() {
        return cityTierStructures;
    }

    public static void setCityTierStructures(List<Structure> cityTierStructures) {
        StructureGenerator.cityTierStructures = cityTierStructures;
    }

    public static Random getRandom() {
        return random;
    }

    public static void setRandom(Random random) {
        StructureGenerator.random = random;
    }

    public static Map<String, Structure> getStructureMap() {
        return structureMap;
    }

    public static void setStructureMap(Map<String, Structure> structureMap) {
        StructureGenerator.structureMap = structureMap;
    }  

    

}
