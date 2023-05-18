package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Library extends Structure
{
    public Library(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        super.structureName = "Library";
        super.incomeFood = -1;
        super.incomeHappiness = 1;
        super.incomeInfluence = 2;
    }
}
