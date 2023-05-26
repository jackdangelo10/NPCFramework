package structures;

import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Citadel extends Structure
{
    public Citadel()
    {
        baseStatAssignments();
    }

    public Citadel(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Citadel";
        super.associatedProfessions.put("Guard", 20);
        super.totalCapacity = 20;
        super.productionTag = ProductionTag.BALANCED;
        super.priority = 6;
    }
}
