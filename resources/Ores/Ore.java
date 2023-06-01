package resources.Ores;

import resources.Resource;

public abstract class Ore extends Resource
{
    public Ore()
    {
        super();
        super.associatedStructure = "Mine";
    }
}
