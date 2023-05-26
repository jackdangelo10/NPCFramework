package structures;
import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class AssemblyHall extends Structure
{
    public AssemblyHall()
    {
        baseStatAssignments();
    }

    public AssemblyHall(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Assembly Hall";
        super.associatedProfessions.put("Politician", 3);
        super.totalCapacity = 3;
        super.productionTag = ProductionTag.POLICY;
        super.priority = 10;
    }
}
