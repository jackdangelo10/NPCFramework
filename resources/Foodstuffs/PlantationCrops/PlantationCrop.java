package resources.Foodstuffs.PlantationCrops;

import resources.Foodstuffs.Foodstuffs;

public abstract class PlantationCrop extends Foodstuffs
{
    public PlantationCrop()
    {
        super.associatedStructure = "Plantation";
    }
}
