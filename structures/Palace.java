package structures;
import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Palace extends Structure 
{
    public Palace()
    {
        baseStatAssignments();
    }

    public Palace(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Palace";
        super.associatedProfessions.put("Steward", 1);
        super.totalCapacity = 1;
        super.productionTag = ProductionTag.INFLUENCE;
    }
}
