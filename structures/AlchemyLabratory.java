package structures;

import civilizations.Civilization;
import settlements.Settlement;

public class AlchemyLabratory extends Structure
{
    public AlchemyLabratory()
    {
        baseStatAssignments();
    }

    public AlchemyLabratory(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Alchemy Labratory";
        super.incomeFood = -1;
        super.incomeGold = 5;
        super.incomeManpower = -1;
        super.incomeInfluence = 3;
    }
}
