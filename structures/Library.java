package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Library extends Structure
{
    public Library()
    {
        baseStatAssignments();
    }

    public Library(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Library";
        super.incomeFood = -1;
        super.incomeHappiness = 1;
        super.incomeInfluence = 2;
        super.associatedProfessions.put("Scholar", 3);
    }
}
