package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Barracks extends Structure
{
    public Barracks(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        super.structureName = "Barracks";
        super.incomeFood = -1;
        super.incomeGold = -1;
        super.incomeManpower = 4;
    }
}
