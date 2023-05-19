package structures;

import civilizations.Civilization;
import settlements.Settlement;

public class Watermill extends Structure
{
    public Watermill()
    {
        baseStatAssignments();
    }

    public Watermill(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Watermill";
        super.incomeFood = 2;
        super.incomeGold = 1;
        super.incomeManpower = 1;
    }
}
