package structures;
import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Castle extends Structure
{
    public Castle()
    {
        baseStatAssignments();
    }

    public Castle(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Castle";
        super.associatedProfessions.put("Guard", 10);
        super.associatedProfessions.put("Worker", 5);
        super.associatedProfessions.put("Castellan", 1);
        super.totalCapacity = 16;
        super.productionTag = ProductionTag.BALANCED;
        super.priority = 8;
    }
}
