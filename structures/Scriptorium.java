package structures;

import civilizations.Civilization;
import settlements.Settlement;

public class Scriptorium extends Structure
{
    public Scriptorium()
    {
        baseStatAssignments();
    }

    public Scriptorium(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Scriptorium";
        super.incomeFood = -1;
        super.incomeGold = -2;
        super.incomeInfluence = 4;
    }
}
