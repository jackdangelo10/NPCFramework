package structures;

import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

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
        super.associatedProfessions.put("Brewer", 4);
        super.totalCapacity = 4;
        super.productionTag = ProductionTag.HAPPINNESS;
        super.priority = 2;
    }
}
