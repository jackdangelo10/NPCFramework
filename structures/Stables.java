package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Stables extends Structure
{
    public Stables()
    {
        baseStatAssignments();
    }

    public Stables(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Stables";
        super.incomeFood = -1;
        super.incomeGold = -1;
        super.incomeManpower = 4;
        super.associatedProfession = "Stablehand";
    }
}
