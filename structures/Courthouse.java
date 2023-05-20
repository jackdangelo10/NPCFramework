package structures;
import java.util.ArrayList;
import java.util.List;
import civilizations.Civilization;
import settlements.Settlement;

public class Courthouse extends Structure
{
    List<Character> jury = null;
    List<Character> panel = null;
    Character headJudge = null;

    public Courthouse()
    {
        baseStatAssignments();
    }

    public Courthouse(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Courthouse";
        super.incomeGold = -1;
        super.incomeManpower = 2;
        super.incomeInfluence = 2;
        super.associatedProfession = "Judge";
    }
}
