package structures;

import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Guildhall extends Structure
{
    //private Faction guild = null;

    public Guildhall()
    {
        baseStatAssignments();
    }

    public Guildhall(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Courthouse";
        super.productionTag = ProductionTag.INFLUENCE;
        super.priority = 1;
    }
}
