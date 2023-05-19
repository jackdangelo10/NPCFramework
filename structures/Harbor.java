package structures;

import civilizations.Civilization;
import settlements.Settlement;

public class Harbor extends Structure
{
    public Harbor()
    {
        baseStatAssignments();
    }

    public Harbor(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Harbor";
        super.incomeFood = 4;
        super.incomeGold = 5;
    }
}
