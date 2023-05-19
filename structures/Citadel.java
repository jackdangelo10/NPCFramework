package structures;

import civilizations.Civilization;
import settlements.Settlement;

public class Citadel extends Structure
{
    public Citadel()
    {
        baseStatAssignments();
    }

    public Citadel(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Citadel";
        super.incomeFood = -1;
        super.incomeGold = -2;
        super.incomeManpower = -4;
        super.incomeInfluence = 4;
    }
}
