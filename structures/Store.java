package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Store extends Structure
{
    public Store(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        super.structureName = "Store";
        super.incomeFood = -1;
        super.incomeGold = 4;
        super.incomeManpower = -1;
    }
}
