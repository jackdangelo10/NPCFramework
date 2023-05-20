package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Bank extends Structure
{
    public Bank()
    {
        baseStatAssignments();
    }

    public Bank(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Bank";
        super.incomeFood = -2;
        super.incomeGold = 10;
        super.incomeManpower = -2;
        super.incomeInfluence = 3;
        super.associatedProfession = "Banker";
    }
}
