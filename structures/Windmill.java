package structures;

import civilizations.Civilization;
import settlements.Settlement;

public class Windmill extends Structure
{
    public Windmill()
    {
        baseStatAssignments();
    }

    public Windmill(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Windmill";
        super.incomeFood = 2;
        super.incomeGold = 1;
        super.incomeManpower = -1;
    }
}
