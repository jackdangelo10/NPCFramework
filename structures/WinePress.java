package structures;

import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class WinePress extends Structure
{
    public WinePress()
    {
        baseStatAssignments();
    }

    public WinePress(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Wine Press";
        super.associatedProfessions.put("Worker", 4);
        super.totalCapacity = 4;
        super.productionTag = ProductionTag.HAPPINNESS;
        super.priority = 1;
    }
}
