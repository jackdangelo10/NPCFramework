package structures;

import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class HolySite extends Structure
{
    public HolySite()
    {
        baseStatAssignments();
    }

    public HolySite(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Holy Site";
        super.associatedProfessions.put("Preacher", 1);
        super.totalCapacity = 1;
        super.productionTag = ProductionTag.CULTURE;
    }
}
