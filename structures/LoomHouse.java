package structures;

import civilizations.Civilization;
import settlements.Settlement;

public class LoomHouse extends Structure
{
    public LoomHouse()
    {
        baseStatAssignments();
    }

    public LoomHouse(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Loomhouse";
        super.incomeFood = -2;
        super.incomeGold = 1;
        super.incomeManpower = -1;
        super.incomeInfluence = 1;
        super.incomeHappiness = 3;
    }
}
