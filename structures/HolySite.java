package structures;

import civilizations.Civilization;
import settlements.Settlement;

public class HolySite extends Structure
{
    public HolySite()
    {
        baseStatAssignments();
    }

    public HolySite(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Holy Site";
        super.incomeFood = -2;
        super.incomeInfluence = 7;
        super.associatedProfession = "Preacher";
    }
}
