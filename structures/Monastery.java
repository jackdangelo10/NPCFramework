package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Monastery extends Structure
{
    public Monastery(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        super.structureName = "Monastery";
        super.incomeFood = -1;
        super.incomeGold = -1;
        super.incomeHappiness = 1;
        super.incomeInfluence = 2;
    }
}
