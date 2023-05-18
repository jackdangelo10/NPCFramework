package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Forge extends Structure
{
    public Forge(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        super.structureName = "Forge";
        super.incomeFood = -1;
        super.incomeGold = -1;
        super.incomeManpower = +4;
    }
}
