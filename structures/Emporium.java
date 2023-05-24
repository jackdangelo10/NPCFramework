package structures;

import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Emporium extends Structure
{
    public Emporium()
    {
        baseStatAssignments();
    }

    public Emporium(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Emporium";
        super.associatedProfessions.put("Merchant", 3);
        super.totalCapacity = 3;
        super.productionTag = ProductionTag.GOLD;
    }
}
