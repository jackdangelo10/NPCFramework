package structures;
import civilizations.Civilization;
import resources.Resource;
import settlements.Settlement;

public class Farmstead extends Structure
{
    private Resource crop = null;

    public Farmstead()
    {
        baseStatAssignments();
    }

    public Farmstead(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Farmstead";
        super.incomeFood = 5;
        super.incomeGold = -3;
        super.incomeManpower = 1;
        super.associatedProfessions.put("Farmer", 4);
    }
}
