package structures;
import characters.NPC;
import civilizations.Civilization;
import settlements.Settlement;

public abstract class Structure 
{
    protected String structureName;
    protected int incomeFood = 0;
    protected int incomeGold = 0;
    protected int incomeInfluence = 0;
    protected int incomeManpower = 0;
    protected int incomeHappiness = 0;

    //where its located
    protected Civilization civ = null;
    protected Settlement settlement = null;
    protected NPC owner = null;
    
    
    
    
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

    
}
