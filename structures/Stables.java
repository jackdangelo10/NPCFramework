package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Stables extends Structure
{
    public Stables(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        super.structureName = "Stables";
        super.incomeFood = -1;
        super.incomeGold = -1;
        super.incomeManpower = 4;
    }
}
