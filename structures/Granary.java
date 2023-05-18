package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Granary extends Structure
{
    public Granary(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        super.structureName = "Granary";
        super.incomeFood = 3;
    }
}
