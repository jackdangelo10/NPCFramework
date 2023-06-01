package resources.Foodstuffs.FarmsteadCrops;

import resources.Foodstuffs.Foodstuffs;

public abstract class FarmsteadCrop extends Foodstuffs
{
    public FarmsteadCrop()
    {
        super.associatedStructure = "Farmstead";
    }
}
