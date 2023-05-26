package structures;
import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Forge extends Structure
{
    public Forge()
    {
        baseStatAssignments();
    }

    public Forge(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Forge";
        super.associatedProfessions.put("Blacksmith", 1);
        super.totalCapacity = 1;
        super.productionTag = ProductionTag.MANPOWER;
        super.priority = 7;
    }
}
