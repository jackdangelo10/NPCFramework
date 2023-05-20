package structures;

import civilizations.Civilization;
import settlements.Settlement;

public class Guildhall extends Structure
{
    //private Faction guild = null;

    public Guildhall()
    {
        baseStatAssignments();
    }

    public Guildhall(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Courthouse";
        super.incomeGold = 1;
        super.incomeManpower = -2;
        super.incomeInfluence = 5;
        super.incomeHappiness = 1;
    }
}
