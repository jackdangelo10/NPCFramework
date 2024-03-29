package structures;
import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Granary extends Structure
{
    public Granary()
    {
        baseStatAssignments();
    }

    public Granary(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Granary";
        super.productionTag = ProductionTag.FOOD;
        super.priority = 3;
    }
}
