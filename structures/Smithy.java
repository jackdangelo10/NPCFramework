package structures;

import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Smithy extends Structure
{
    public Smithy()
    {
        baseStatAssignments();
    }

    public Smithy(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Smithy";
        super.associatedProfessions.put("Blacksmith", 1);
        super.totalCapacity = 1;
        super.productionTag = ProductionTag.MANPOWER;
        super.priority = 9;
    }
}
