package structures;
import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Monastery extends Structure
{
    public Monastery()
    {
        baseStatAssignments();
    }

    public Monastery(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Monastery";
        super.associatedProfessions.put("Monk", 5);
        super.totalCapacity = 5;
        super.productionTag = ProductionTag.CULTURE;
    }
}
