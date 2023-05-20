package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Shrine extends Structure
{
    public Shrine()
    {
        baseStatAssignments();
    }

    public Shrine(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Shrine";
        super.incomeInfluence = 3;
        super.associatedProfession = "Preacher";
    }
}
