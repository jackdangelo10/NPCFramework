package structures;

import civilizations.Civilization;
import settlements.Settlement;

public class Brewery extends Structure
{
    public Brewery()
    {
        baseStatAssignments();
    }

    public Brewery(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Brewery";
        super.incomeFood = 2;
        super.incomeGold = 3;
        super.incomeManpower = -2;
        super.associatedProfessions.put("Brewer", 4);
    }
}
