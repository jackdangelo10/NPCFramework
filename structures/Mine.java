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
        super.associatedProfessions.put("Miner", 7);
        super.totalCapacity = 7;
        super.productionTag = ProductionTag.MANPOWER;
    }
}
