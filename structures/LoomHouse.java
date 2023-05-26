package structures;

import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class LoomHouse extends Structure
{
    public LoomHouse()
    {
        baseStatAssignments();
    }

    public LoomHouse(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Loomhouse";
        super.associatedProfessions.put("Weaver", 3);
        super.totalCapacity = 3;
        super.productionTag = ProductionTag.CULTURE;
        super.priority = 2;
    }
}
