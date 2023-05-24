package structures;

import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Workshop extends Structure
{
    public Workshop()
    {
        baseStatAssignments();
    }

    public Workshop(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Workshop";
        super.associatedProfessions.put("Carpenter", 1);
        super.totalCapacity = 1;
        super.productionTag = ProductionTag.MANPOWER;

    }
}
