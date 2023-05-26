package structures;

import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Guardhouse extends Structure
{
    public Guardhouse()
    {
        baseStatAssignments();
    }

    public Guardhouse(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Guardhouse";
        super.associatedProfessions.put("Guard", 5);
        super.totalCapacity = 5;
        super.productionTag = ProductionTag.BALANCED;
        super.priority = 5;
    }
}
