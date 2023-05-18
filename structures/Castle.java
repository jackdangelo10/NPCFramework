package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Castle extends Structure
{
    public Castle(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        super.structureName = "Castle";
        super.incomeFood = -2;
        super.incomeGold = -2;
        super.incomeManpower = 6;
        super.incomeInfluence = 1;
    }
}
