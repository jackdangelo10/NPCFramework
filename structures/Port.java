package structures;

import civilizations.Civilization;
import settlements.Settlement;

public class Port extends Structure
{
    public Port()
    {
        baseStatAssignments();
    }

    public Port(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Port";
        super.incomeFood = 3;
        super.incomeGold = 1;
        super.incomeManpower = -2;
        super.incomeInfluence = 2;
        super.associatedProfession = "Fisher";
    }
}
