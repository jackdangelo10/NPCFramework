package structures;
import java.util.ArrayList;
import java.util.List;
import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class Barracks extends Structure
{
    List<Character> stationedGuards = new ArrayList<Character>();

    public Barracks()
    {
        baseStatAssignments();
    }

    public Barracks(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        baseStatAssignments();
        
    }

    protected void baseStatAssignments()
    {
        super.structureName = "Barracks";
        super.associatedProfessions.put("Guard", 15);
        super.totalCapacity = 15;
        super.productionTag = ProductionTag.INFLUENCE;
    }

    public void addGuard(Character c)
    {
        stationedGuards.add(c);
    }
}
