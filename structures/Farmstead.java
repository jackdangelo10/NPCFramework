package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Farmstead extends Structure
{
    public Farmstead(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        super.structureName = "Farmstead";
        super.incomeFood = 5;
        super.incomeGold = -3;
        super.incomeManpower = 1;
    }
}
