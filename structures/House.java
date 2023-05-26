package structures;
import java.util.ArrayList;
import java.util.List;

import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class House extends Structure
{
    private static List<characters.Character> household = new ArrayList<characters.Character>();

    public House()
    {
        baseStatAssignments();
    }

    public House(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
    }

    protected void baseStatAssignments()
    {
        super.structureName = "House";
        super.associatedProfessions.put("Unemployed", 10);
        super.totalCapacity = 10;
        super.productionTag = ProductionTag.BALANCED;
        super.priority = 1;
    }

    public void assignHouseholdMember(characters.Character offspring)
    {
        household.add(offspring);
    }
    
}
