package structures;
import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Quarry extends Structure
{
    public Quarry()
    {
        baseStatAssignments();
    }

    public Quarry(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Quarry";
        super.associatedProfessions.put("Miner", 7);
        super.totalCapacity = 7;
        super.productionTag = ProductionTag.MANPOWER;
        super.priority = 6;
    }   
}
