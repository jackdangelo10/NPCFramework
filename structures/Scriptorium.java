package structures;

import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Scriptorium extends Structure
{
    public Scriptorium()
    {
        baseStatAssignments();
    }

    public Scriptorium(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Scriptorium";
        super.associatedProfessions.put("Scholar", 3);
        super.totalCapacity = 3;
        super.productionTag = ProductionTag.RESEARCH;
    }
}
