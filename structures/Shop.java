package structures;
import civilizations.Civilization;
import settlements.Settlement;

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
        super.incomeFood = -1;
        super.incomeGold = 4;
        super.incomeManpower = -1;
        super.associatedProfessions.put("Merchant", 3);
    }
}
