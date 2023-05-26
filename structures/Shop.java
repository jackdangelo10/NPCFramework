package structures;
import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Shop extends Structure
{
    public Shop()
    {
        baseStatAssignments();
    }

    public Shop(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Store";
        super.associatedProfessions.put("Merchant", 3);
        super.totalCapacity = 3;
        super.productionTag = ProductionTag.GOLD;
        super.priority = 5;
    }
}
