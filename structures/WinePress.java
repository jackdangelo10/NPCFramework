package structures;

import civilizations.Civilization;
import settlements.Settlement;

public class WinePress extends Structure
{
    public WinePress()
    {
        baseStatAssignments();
    }

    public WinePress(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Wine Press";
        super.incomeFood = 3;
        super.incomeGold = 2;
        super.incomeManpower = -2;
        super.incomeInfluence = 1;
        super.associatedProfessions.put("Worker", 4);
    }
}
