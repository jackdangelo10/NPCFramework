package structures;

import civilizations.Civilization;
import settlements.Settlement;

public class Guardhouse extends Structure
{
    public Guardhouse()
    {
        baseStatAssignments();
    }

    public Guardhouse(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Guardhouse";
        super.incomeGold = -1;
        super.incomeManpower = -1;
        super.associatedProfessions.put("Guard", 5);
    }
}
