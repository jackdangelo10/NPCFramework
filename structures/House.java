package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class House extends Structure
{
    public House(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        super.structureName = "House";
        super.incomeFood = -2;
        super.incomeManpower = 2;
    }
}
