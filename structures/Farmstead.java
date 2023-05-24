package structures;
import civilizations.Civilization;
import resources.Resource;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Farmstead extends Structure
{
    private Resource crop = null;

    public Farmstead()
    {
        baseStatAssignments();
    }

    public Farmstead(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Farmstead";
        super.associatedProfessions.put("Farmer", 4);
        super.totalCapacity = 4;
        super.productionTag = ProductionTag.FOOD;
    }
}
