package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class TownHall extends Structure
{
    public TownHall()
    {
        baseStatAssignments();
    }

    public TownHall(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Town Hall";
        super.incomeFood = -1;
        super.incomeGold = -1;
        super.incomeManpower = 3;
        super.incomeInfluence = 5;
    }
}
