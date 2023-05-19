package structures;

import civilizations.Civilization;
import settlements.Settlement;

public class University extends Structure
{
    public University()
    {
        baseStatAssignments();
    }

    public University(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "University";
        super.incomeFood = -1;
        super.incomeGold = -1;
        super.incomeManpower = -1;
        super.incomeInfluence = 6;
    }
}
