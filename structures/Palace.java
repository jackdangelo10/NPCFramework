package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Palace extends Structure 
{
    public Palace()
    {
        baseStatAssignments();
    }

    public Palace(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Palace";
        super.incomeFood = -1;
        super.incomeGold = -1;
        super.incomeManpower = -1;
        super.incomeInfluence = 10;
        super.associatedProfessions.put("Steward", 1);
    }
}
