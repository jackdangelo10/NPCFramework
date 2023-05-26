package structures;
import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Mine extends Structure
{
    public Mine()
    {
        baseStatAssignments();
    }

    public Mine(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Mine";
        super.associatedProfessions.put("Miner", 3);
        super.totalCapacity = 3;
        super.priority = 7;
        super.productionTag = ProductionTag.MANPOWER;
    }
}
