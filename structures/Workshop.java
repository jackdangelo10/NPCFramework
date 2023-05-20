package structures;

import civilizations.Civilization;
import settlements.Settlement;

public class Workshop extends Structure
{
    public Workshop()
    {
        baseStatAssignments();
    }

    public Workshop(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Workshop";
        super.incomeGold = -1;
        super.incomeManpower = 3;
        super.associatedProfessions.put("Carpenter", 1);

    }
}
