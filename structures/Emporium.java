package structures;

import civilizations.Civilization;
import settlements.Settlement;

public class Emporium extends Structure
{
    public Emporium()
    {
        baseStatAssignments();
    }

    public Emporium(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Emporium";
        super.incomeGold = 7;
        super.incomeManpower = -2;
        super.incomeInfluence = 2;
    }
}
