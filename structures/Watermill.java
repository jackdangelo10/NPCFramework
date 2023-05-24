package structures;

import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Watermill extends Structure
{
    public Watermill()
    {
        baseStatAssignments();
    }

    public Watermill(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Watermill";
        super.associatedProfessions.put("Miller", 1);
        super.totalCapacity = 1;
        super.productionTag = ProductionTag.FOOD;
    }
}
