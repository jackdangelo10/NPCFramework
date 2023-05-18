package settlements;

import java.util.ArrayList;
import java.util.List;
import characters.Family;
import characters.NPC;
import civilizations.Civilization;
import structures.Structure;

abstract public class Settlement 
{
    protected Civilization civilization = null;

    //demographics
    protected List<NPC> inhabitants = new ArrayList<NPC>();
    protected List<Family> families = new ArrayList<Family>();
    protected String settlementName;
    protected String settlementAdjective;
    protected String settlementSizeName;
    protected int MAX_POP = 0;
    protected int MIN_POP = 0;
    
    protected LocalEconomy economy = null;
    protected LocalGovernment government = null;
    protected ArrayList<Structure> structures = new ArrayList<Structure>();

    

/**GETTERS AND SETTERS ******************************************************************************* */

    public Civilization getCivilization() {
        return civilization;
    }
    public void setCivilization(Civilization civilization) {
        this.civilization = civilization;
    }
    public List<NPC> getInhabitants() {
        return inhabitants;
    }
    public void setInhabitants(List<NPC> inhabitants) {
        this.inhabitants = inhabitants;
    }
    public List<Family> getFamilies() {
        return families;
    }
    public void setFamilies(List<Family> families) {
        this.families = families;
    }
    public String getSettlementName() {
        return settlementName;
    }
    public void setSettlementName(String settlementName) {
        this.settlementName = settlementName;
    }
    public String getSettlementAdjective() {
        return settlementAdjective;
    }
    public void setSettlementAdjective(String settlementAdjective) {
        this.settlementAdjective = settlementAdjective;
    }
    public String getSettlementSizeName() {
        return settlementSizeName;
    }
    public void setSettlementSizeName(String settlementSizeName) {
        this.settlementSizeName = settlementSizeName;
    }
    public LocalEconomy getEconomy() {
        return economy;
    }
    public void setEconomy(LocalEconomy economy) {
        this.economy = economy;
    }
    public LocalGovernment getGovernment() {
        return government;
    }
    public void setGovernment(LocalGovernment government) {
        this.government = government;
    }
    public ArrayList<Structure> getStructures() {
        return structures;
    }
    public void setStructures(ArrayList<Structure> structures) {
        this.structures = structures;
    }

}
