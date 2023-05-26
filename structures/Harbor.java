package structures;

import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Harbor extends Structure
{
    public Harbor()
    {
        baseStatAssignments();
    }

    public Harbor(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Harbor";
        super.associatedProfessions.put("Fisher", 10);
        super.totalCapacity = 10;
        super.productionTag = ProductionTag.FOOD;
        super.priority = 8;
    }
}
