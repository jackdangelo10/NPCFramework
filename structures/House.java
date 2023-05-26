package structures;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import characters.Character;
import civilizations.Civilization;
import settlements.Settlement;
import structures.StructureAttributes.ProductionTag;

public class House extends Structure
{
    private static List<characters.Character> household = new ArrayList<characters.Character>();
    private int houseCount = 0;

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

    public void assignHouseholdMember(characters.Character person) throws ArrayIndexOutOfBoundsException
    {
        if(household.size() < totalCapacity)
        {
            household.add(person);
            person.setAssignedStructure(this);
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException("Housing is full");
        }
    }

    public void addHouse()
    {
        houseCount++;
        totalCapacity += 10;
    }

    public Queue<characters.Character> addAll(List<characters.Character> unemployed)
    {
        Queue<characters.Character> unhoused = new LinkedList<characters.Character>(unemployed);
        try
        {
            while(!unhoused.isEmpty())
            {
                Character c = unhoused.poll();
                assignHouseholdMember(c);
            }
            return null;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.toString());
            return unhoused;
        }
    }

/**GETTERS AND SETTERS *********************************************************************** */

    public static List<characters.Character> getHousehold() {
        return household;
    }

    public static void setHousehold(List<characters.Character> household) {
        House.household = household;
    }

    public int getHouseCount() {
        return houseCount;
    }

    public void setHouseCount(int houseCount) {
        this.houseCount = houseCount;
    }
    
    
}
