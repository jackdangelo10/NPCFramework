package structures;

import civilizations.Civilization;
import settlements.Settlement;

public class Temple extends Structure
{
    public Temple()
    {
        baseStatAssignments();
    }

    public Temple(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Temple";
        super.incomeGold = -1;
        super.incomeInfluence = 3;
        super.associatedProfessions.put("Preacher", 1);
    }
}
