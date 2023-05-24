package structures;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import characters.NPC;
import civilizations.Civilization;
import settlements.Settlement;

public abstract class Structure implements Cloneable
{

    protected String structureName;

    protected List<characters.Character> assignedNPCs = new ArrayList<characters.Character>();
    protected Map<String, List<characters.Character>> assignedCharactersByProfession = new HashMap<>();
    protected Map<String, Integer> associatedProfessions = new HashMap<String, Integer>();
    protected StructureAttributes.ProductionTag productionTag = null;
    
    protected characters.Character apprentice = null;
    protected int totalCapacity = 0;

    //where its located
    protected Civilization civ = null;
    protected Settlement settlement = null;
    protected NPC owner = null;
    
    abstract protected void baseStatAssignments();

/**CLONABLE IMPLEMENTATION ************************************************************ */

    @Override
    public Structure clone() {
        try 
        {
            return (Structure) super.clone();
        } catch (CloneNotSupportedException e) 
        {
            // Handle the exception if necessary
            return null;
        }
    }
    
/**ASSIGNMENT LOGIC ******************************************************************** */

    public boolean hasVacancy(String profession)
    {
        int capacity = associatedProfessions.get(profession);
        int currentSize; 
        if(assignedCharactersByProfession.get(profession) == null)
        {
            currentSize = 0;
        }
        else
        {
            currentSize = assignedCharactersByProfession.get(profession).size();
        }
        
        if(currentSize >= capacity)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public boolean hasApprentice() 
    {
        return apprentice != null && !assignedNPCs.contains(apprentice);
    }

    public boolean isFull()
    {
        if(assignedNPCs.size() >= totalCapacity)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
/**GETTERS AND SETTERS ************************************************************* */
    public StructureAttributes.ProductionTag getProductionTag()
    {
        return productionTag;
    }

    public String getStructureName() {
        return structureName;
    }
    public void setStructureName(String structureName) {
        this.structureName = structureName;
    }
    public Civilization getCiv() {
        return civ;
    }
    public void setCiv(Civilization civ) {
        this.civ = civ;
    }
    public Settlement getSettlement() {
        return settlement;
    }
    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }
    public NPC getOwner() {
        return owner;
    }
    public void setOwner(NPC owner) {
        this.owner = owner;
    }

    public List<characters.Character> getAssignedNPCs() {
        return assignedNPCs;
    }

    public void setAssignedNPCs(List<characters.Character> assignedNPCs) {
        this.assignedNPCs = assignedNPCs;

    }

    public Map<String, Integer> getAssociatedProfessions() {
        return associatedProfessions;
    }

    public void setAssociatedProfessions(Map<String, Integer> associatedProfessions) {
        this.associatedProfessions = associatedProfessions;
    }

    public characters.Character getApprentice() {
        return apprentice;
    }

    public void setApprentice(characters.Character apprentice) {
        this.apprentice = apprentice;
    }

    public Map<String, List<characters.Character>> getAssignedCharactersByProfession() {
        return assignedCharactersByProfession;
    }

    public void setAssignedCharactersByProfession(Map<String, List<characters.Character>> assignedCharactersByProfession) {
        this.assignedCharactersByProfession = assignedCharactersByProfession;
    }

    public void setProductionTag(StructureAttributes.ProductionTag productionTag) {
        this.productionTag = productionTag;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    } 
    
    
}
