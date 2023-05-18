package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class LumberMill extends Structure
{
    public LumberMill(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        super.structureName = "LumberMill";
        super.incomeFood = 0;
        super.incomeGold = 2;
        super.incomeManpower = -2;
    }
}
