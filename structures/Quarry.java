package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Quarry extends Structure
{
    public Quarry()
    {
        baseStatAssignments();
    }

    public Quarry(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Quarry";
        super.incomeFood = -3;
        super.incomeGold = -3;
        super.incomeManpower = 5;
    }   
}
