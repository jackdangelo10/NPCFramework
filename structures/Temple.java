package structures;

import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Temple extends Structure
{
    public Temple()
    {
        baseStatAssignments();
    }

    public Temple(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Temple";
        super.associatedProfessions.put("Preacher", 1);
        super.totalCapacity = 1;
        super.productionTag = ProductionTag.CULTURE;
    }
}
