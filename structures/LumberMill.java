package structures;
import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class LumberMill extends Structure
{
    public LumberMill()
    {
        baseStatAssignments();
    }

    public LumberMill(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Lumber Mill";
        super.associatedProfessions.put("Miller", 3);
        super.totalCapacity = 3;
        super.productionTag = ProductionTag.MANPOWER;
        super.priority = 7;
    }
}
