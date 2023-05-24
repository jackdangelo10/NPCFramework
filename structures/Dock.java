package structures;
import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Dock extends Structure
{
    public Dock()
    {
        baseStatAssignments();
    }

    public Dock(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Dock";
        super.associatedProfessions.put("Fisher", 5);
        super.totalCapacity = 5;
        super.productionTag = ProductionTag.FOOD;
        
    }
}
