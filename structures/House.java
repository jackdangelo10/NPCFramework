package structures;
import java.util.List;

import civilizations.Civilization;
import settlements.Settlement;

public class House extends Structure
{
    List<Character> household = null;

    public House()
    {
        baseStatAssignments();
    }

    public House(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
    }

    protected void baseStatAssignments()
    {
        super.structureName = "House";
        super.incomeFood = -2;
        super.incomeManpower = 2;
    }
}
