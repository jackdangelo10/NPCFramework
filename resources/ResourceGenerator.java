package resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import resources.Foodstuffs.AnimalResources.BeastOfBurdenAnimalResource;
import resources.Foodstuffs.AnimalResources.DomesticAnimalResource;
import resources.Foodstuffs.AnimalResources.LivestockResource;
import resources.Foodstuffs.FarmsteadCrops.FruitResource;
import resources.Foodstuffs.FarmsteadCrops.GrainResource;
import resources.Foodstuffs.FarmsteadCrops.VegetableResource;
import resources.Foodstuffs.PlantationCrops.Dyes;
import resources.Foodstuffs.PlantationCrops.FiberResource;
import resources.Foodstuffs.PlantationCrops.SpiceResource;
import resources.Foodstuffs.PlantationCrops.Sugar;
import resources.Materials.Stone.Granite;
import resources.Materials.Stone.Marble;
import resources.Materials.Stone.Sandstone;
import resources.Materials.Stone.Slate;
import resources.Materials.Timber.Birch;
import resources.Materials.Timber.Cedar;
import resources.Materials.Timber.Mahogany;
import resources.Materials.Timber.Oak;
import resources.Ores.Metals.Copper;
import resources.Ores.Metals.Gold;
import resources.Ores.Metals.Iron;
import resources.Ores.Metals.Silver;
import resources.Ores.Minerals.Diamonds;
import resources.Ores.Minerals.Gemstones;
import resources.Ores.Minerals.Moonstone;
import resources.Ores.Minerals.Salt;

public class ResourceGenerator 
{
    private static ArrayList<Resource> resources;

    private static ArrayList<Resource> foodstuffs = new ArrayList<Resource>();
    private static ArrayList<Resource> animalResources = new ArrayList<Resource>();
    private static ArrayList<Resource> plantationCrops = new ArrayList<Resource>();
    private static ArrayList<Resource> farmsteadCrops = new ArrayList<Resource>();

    private static ArrayList<Resource> materials = new ArrayList<Resource>();
    private static ArrayList<Resource> timber = new ArrayList<Resource>();
    private static ArrayList<Resource> stone = new ArrayList<Resource>();

    private static ArrayList<Resource> ores = new ArrayList<Resource>();
    private static ArrayList<Resource> metals = new ArrayList<Resource>();
    private static ArrayList<Resource> minerals = new ArrayList<Resource>();
    private static Map<String, Resource> resourceMap = new HashMap<String, Resource>();
    private static Random random;

    public ResourceGenerator()
    {
        random = new Random();

        Resource beastOfBurdenResource = new BeastOfBurdenAnimalResource(null);
        Resource domesticAnimalResource = new DomesticAnimalResource(null);
        Resource livestockResource = new LivestockResource(null);
        Resource fruitResource = new FruitResource();
        Resource grainResource = new GrainResource();
        Resource vegetableResource = new VegetableResource();
        Resource dyes = new Dyes();
        Resource fiberResource = new FiberResource();
        Resource spiceResource = new SpiceResource();
        Resource sugar = new Sugar();
        Resource granite = new Granite();
        Resource marble = new Marble();
        Resource sandstone = new Sandstone();
        Resource slate = new Slate();
        Resource birch = new Birch();
        Resource cedar = new Cedar();
        Resource mahogany = new Mahogany();
        Resource oak = new Oak();
        Resource copper = new Copper();
        Resource gold = new Gold();
        Resource iron = new Iron();
        Resource silver = new Silver();
        Resource diamonds = new Diamonds();
        Resource moonstone = new Moonstone();
        Resource gemstones = new Gemstones();
        Resource salt = new Salt();

        animalResources.add(beastOfBurdenResource);
        animalResources.add(domesticAnimalResource);
        animalResources.add(livestockResource);
        
        farmsteadCrops.add(fruitResource);
        farmsteadCrops.add(grainResource);
        farmsteadCrops.add(vegetableResource);

        plantationCrops.add(dyes);
        plantationCrops.add(fiberResource);
        plantationCrops.add(spiceResource);
        plantationCrops.add(sugar);

        foodstuffs.addAll(animalResources);
        foodstuffs.addAll(farmsteadCrops);
        foodstuffs.addAll(plantationCrops);

        stone.add(granite);
        stone.add(marble);
        stone.add(sandstone);
        stone.add(slate);

        timber.add(birch);
        timber.add(cedar);
        timber.add(mahogany);
        timber.add(oak);

        materials.addAll(stone);
        materials.addAll(timber);

        metals.add(silver);
        metals.add(gold);
        metals.add(iron);
        metals.add(copper);

        minerals.add(moonstone);
        minerals.add(gemstones);
        minerals.add(diamonds);
        minerals.add(salt);

        ores.addAll(metals);
        ores.addAll(minerals);

        resourceMap.put("Beast of Burden", beastOfBurdenResource);
        resourceMap.put("Domestic Animals", domesticAnimalResource);
        resourceMap.put("Livestock", livestockResource);
        resourceMap.put("Fruits", fruitResource);
        resourceMap.put("Grains", grainResource);
        resourceMap.put("Vegetables", vegetableResource);
        resourceMap.put("Dyes", dyes);
        resourceMap.put("Fibers", fiberResource);
        resourceMap.put("Spices", spiceResource);
        resourceMap.put("Sugar", sugar);
        resourceMap.put("Granite", granite);
        resourceMap.put("Marble", marble);
        resourceMap.put("Sandstone", sandstone);
        resourceMap.put("Slate", slate);
        resourceMap.put("Birch", birch);
        resourceMap.put("Cedar", cedar);
        resourceMap.put("Mahogany", mahogany);
        resourceMap.put("Oak", oak);
        resourceMap.put("Copper", copper);
        resourceMap.put("Silver", silver);
        resourceMap.put("Gold", gold);
        resourceMap.put("Iron", iron);
        resourceMap.put("Diamonds", diamonds);
        resourceMap.put("Gemstones", gemstones);
        resourceMap.put("Salt", salt);
        resourceMap.put("Moonstone", moonstone);
    }

    //ALLLL CLON!!!!!!!!!!!!!

    public Resource generateRandomResource()
    {
        if (resources.isEmpty()) 
        {
            return null;
        }
        
        int index = random.nextInt(resources.size());
        return resources.get(index).clone();
    }

    public Resource generateRandomFoodstuff()
    {
        if (foodstuffs.isEmpty()) 
        {
            return null;
        }
        
        int index = random.nextInt(foodstuffs.size());
        return foodstuffs.get(index).clone();
    }

    public Resource generateRandomPlantationCrop()
    {
        if(plantationCrops.isEmpty())
        {
            return null;
        }
        int index = random.nextInt(plantationCrops.size());
        return plantationCrops.get(index).clone();
    }

    public Resource generateRandomFarmsteadCrop()
    {
        if(farmsteadCrops.isEmpty())
        {
            return null;
        }
        int index = random.nextInt(farmsteadCrops.size());
        return farmsteadCrops.get(index).clone();
    }

    public Resource generateRandomAnimalResource()
    {
        if(animalResources.isEmpty())
        {
            return null;
        }
        int index = random.nextInt(animalResources.size());
        return animalResources.get(index).clone();
    }

    public Resource generateRandomOre()
    {
        if(ores.isEmpty())
        {
            return null;
        }
        int index = random.nextInt(ores.size());
        return ores.get(index).clone();
    }

    public Resource generateRandomMetal()
    {
        if(metals.isEmpty())
        {
            return null;
        }
        int index = random.nextInt(metals.size());
        return metals.get(index).clone();
    }

    public Resource generateRandomMineral()
    {
        if(minerals.isEmpty())
        {
            return null;
        }
        int index = random.nextInt(minerals.size());
        return minerals.get(index).clone();
    }

    public Resource generateRandomMaterial()
    {
        if(materials.isEmpty())
        {
            return null;
        }
        int index = random.nextInt(materials.size());
        return materials.get(index).clone();
    }

    public Resource generateRandomTimber()
    {
        if(timber.isEmpty())
        {
            return null;
        }
        int index = random.nextInt(timber.size());
        return timber.get(index).clone();
    }

    public Resource generateRandomStone()
    {
        if(stone.isEmpty())
        {
            return null;
        }
        int index = random.nextInt(stone.size());
        return stone.get(index).clone();
    }

    public List<Resource> generateRandomResourceSpawn()
    {
        
        return null;
    }
}
