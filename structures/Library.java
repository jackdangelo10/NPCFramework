package structures;
import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Library extends Structure
{
    public Library()
    {
        baseStatAssignments();
    }

    public Library(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Library";
        super.associatedProfessions.put("Scholar", 3);
        super.totalCapacity = 3;
        super.productionTag = ProductionTag.RESEARCH;
        super.priority = 4;
    }
}
