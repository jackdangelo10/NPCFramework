package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Pasture extends Structure
{
    public Pasture(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        super.structureName = "Pasture";
        super.incomeFood = 3;
        super.incomeGold = -1;
    }
}
