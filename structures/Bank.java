package structures;
import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Bank extends Structure
{
    public Bank()
    {
        baseStatAssignments();
    }

    public Bank(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Bank";
        super.associatedProfessions.put("Banker", 5);
        super.totalCapacity = 5;
        super.productionTag = ProductionTag.GOLD;
    }
}
