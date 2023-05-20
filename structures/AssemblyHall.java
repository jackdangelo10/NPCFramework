package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class AssemblyHall extends Structure
{
    public AssemblyHall()
    {
        baseStatAssignments();
    }

    public AssemblyHall(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Assembly Hall";
        super.incomeFood = -1;
        super.incomeGold = -1;
        super.incomeManpower = 3;
        super.incomeInfluence = 5;
        super.associatedProfessions.put("Politician", 50);
    }
}
