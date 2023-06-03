package resources.Materials.Timber;

import resources.Materials.Materials;

public abstract class Timber extends Materials
{
    public Timber()
    {
        super.associatedStructure = "Lumber Mill";
        super.manpowerOutput = 1;
    }
}
