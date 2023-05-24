package structures;
import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Stables extends Structure
{
    public Stables()
    {
        baseStatAssignments();
    }

    public Stables(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Stables";
        super.associatedProfessions.put("Stablehand", 2);
        super.totalCapacity = 2;
        super.productionTag = ProductionTag.FOOD;
    }
}
