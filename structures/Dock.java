package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Dock extends Structure
{
    public Dock()
    {
        baseStatAssignments();
    }

    public Dock(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Dock";
        super.incomeFood = 4;
        super.incomeGold = 1;
        super.incomeManpower = -3;
    }
}
