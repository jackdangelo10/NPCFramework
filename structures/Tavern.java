package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Tavern extends Structure
{
    public Tavern(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        super.structureName = "Tavern";
        super.incomeFood = -1;
        super.incomeGold = 1;
        super.incomeManpower = -1;
        super.incomeHappiness = 3;
    }
}
