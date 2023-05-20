package structures;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import characters.NPC;
import civilizations.Civilization;
import professions.Profession;
import professions.ProfessionGenerator;
import settlements.Settlement;

public abstract class Structure implements Cloneable
{

    protected String structureName;
    protected int incomeFood = 0;
    protected int incomeGold = 0;
    protected int incomeInfluence = 0;
    protected int incomeManpower = 0;
    protected int incomeHappiness = 0;

    protected List<characters.Character> assignedNPCs = new ArrayList<characters.Character>();

    protected Map<String, List<characters.Character>> assignedCharactersByProfession = new HashMap<>();
    protected Map<String, Integer> associatedProfessions = new HashMap<String, Integer>();
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
        int currentSize = assignedCharactersByProfession.get(profession).size();
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
    public String getStructureName() {
        return structureName;
    }
    public void setStructureName(String structureName) {
        this.structureName = structureName;
    }
    public int getIncomeFood() {
        return incomeFood;
    }
    public void setIncomeFood(int incomeFood) {
        this.incomeFood = incomeFood;
    }
    public int getIncomeGold() {
        return incomeGold;
    }
    public void setIncomeGold(int incomeGold) {
        this.incomeGold = incomeGold;
    }
    public int getIncomeInfluence() {
        return incomeInfluence;
    }
    public void setIncomeInfluence(int incomeInfluence) {
        this.incomeInfluence = incomeInfluence;
    }
    public int getIncomeManpower() {
        return incomeManpower;
    }
    public void setIncomeManpower(int incomeManpower) {
        this.incomeManpower = incomeManpower;
    }
    public int getIncomeHappiness() {
        return incomeHappiness;
    }
    public void setIncomeHappiness(int incomeHappiness) {
        this.incomeHappiness = incomeHappiness;
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
    
    
}
