package structures;
import civilizations.Civilization;
import resources.Resource;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Pasture extends Structure
{
    private Resource animal = null;

    public Pasture()
    {
        baseStatAssignments();
    }

    public Pasture(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Pasture";
        super.associatedProfessions.put("Farmer", 2);
        super.totalCapacity = 2;
        super.productionTag = ProductionTag.FOOD;
    }
}
