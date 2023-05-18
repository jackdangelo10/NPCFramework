package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Dock extends Structure
{
    public Dock(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        super.structureName = "Dock";
        super.incomeFood = 4;
        super.incomeGold = 1;
        super.incomeManpower = -3;
    }
}
