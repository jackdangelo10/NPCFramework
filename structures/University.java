package structures;

import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class University extends Structure
{
    public University()
    {
        baseStatAssignments();
    }

    public University(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "University";
        super.associatedProfessions.put("Scholar", 6);
        super.totalCapacity = 6;
        super.productionTag = ProductionTag.RESEARCH;
    }
}
