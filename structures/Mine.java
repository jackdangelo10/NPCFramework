package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Mine extends Structure
{
    public Mine(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        super.structureName = "Mine";
        super.incomeGold = 2;
        super.incomeGold = -3;
        super.incomeManpower = 3;
    }
}
