package structures;

import civilizations.Civilization;
import resources.Resource;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Plantation extends Structure
{
    private Resource crop = null;

    public Plantation()
    {
        baseStatAssignments();
    }

    public Plantation(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Plantation";
        super.associatedProfessions.put("Farmer", 4);
        super.totalCapacity = 4;
        super.productionTag = ProductionTag.FOOD;
        super.priority = 8;
    }
}
