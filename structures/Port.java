package structures;

import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Port extends Structure
{
    public Port()
    {
        baseStatAssignments();
    }

    public Port(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Port";
        super.associatedProfessions.put("Fisher", 15);
        super.totalCapacity = 15;
        super.productionTag = ProductionTag.FOOD;
        super.priority = 7;
    }
}
