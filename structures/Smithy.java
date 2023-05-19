package structures;

import civilizations.Civilization;
import settlements.Settlement;

public class Smithy extends Structure
{
    public Smithy()
    {
        baseStatAssignments();
    }

    public Smithy(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Smithy";
        super.incomeGold = -1;
        super.incomeManpower = 3;
    }
}
