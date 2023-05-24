package structures;

import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

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
        super.associatedProfessions.put("Alchemist", 3);
        super.totalCapacity = 3;
        super.productionTag = ProductionTag.RESEARCH;
    }
}
