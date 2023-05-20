package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Castle extends Structure
{
    public Castle()
    {
        baseStatAssignments();
    }

    public Castle(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Castle";
        super.incomeFood = -2;
        super.incomeGold = -2;
        super.incomeManpower = 6;
        super.incomeInfluence = 1;
        super.associatedProfessions.put("Guard", 10);
        super.associatedProfessions.put("Worker", 5);
        super.associatedProfessions.put("Castellan", 1);
    }
}
