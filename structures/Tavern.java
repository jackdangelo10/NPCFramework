package structures;
import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Tavern extends Structure
{
    public Tavern()
    {
        baseStatAssignments();
    }

    public Tavern(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Tavern";
        super.associatedProfessions.put("Barkeeper", 1);
        super.associatedProfessions.put("Worker", 1);
        super.totalCapacity = 2;
        super.productionTag = ProductionTag.HAPPINNESS;
        super.priority = 2;
    }
}
