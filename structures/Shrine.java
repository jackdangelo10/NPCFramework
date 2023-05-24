package structures;
import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Shrine extends Structure
{
    public Shrine()
    {
        baseStatAssignments();
    }

    public Shrine(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Shrine";
        super.associatedProfessions.put("Preacher", 1);
        super.totalCapacity = 1;
        super.productionTag = ProductionTag.CULTURE;
    }
}
