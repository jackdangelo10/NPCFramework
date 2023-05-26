package structures;

import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Windmill extends Structure
{
    public Windmill()
    {
        baseStatAssignments();
    }

    public Windmill(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Windmill";
        super.associatedProfessions.put("Miller", 1);
        super.totalCapacity = 1;
        super.productionTag = ProductionTag.MANPOWER;
        super.priority = 3;
    }
}
