package settlements;

import java.util.ArrayList;
import java.util.List;
import characters.Family;
import characters.NPC;
import civilizations.Civilization;
import structures.Structure;
import characters.Character;

abstract public class Settlement 
{
    protected Civilization civilization = null;

    //demographics
    protected List<Character> inhabitants = new ArrayList<Character>();
    protected List<Family> families = new ArrayList<Family>();
    protected String settlementName;
    protected String settlementAdjective;
    protected String settlementSizeName;
    protected int MAX_STRUCTURES = 0;
    protected int MIN_STRUCTURES = 0;
    
    //protected LocalEconomy economy = null;
    //protected LocalGovernment government = null;
    protected ArrayList<Structure> structures = new ArrayList<Structure>();

/**ADDING PEOPLE */

    public void addInhabitant(Character c)
    {
        inhabitants.add(c);
        addFamily(c.getFamily());
    }

    public void addFamily(Family f)
    {
        families.add(f);
        for(Character i : f.getMembers())
        {
            addInhabitant(i);
        }
    }

    public void addStructure(Structure s)
    {
        structures.add(s);
    }
    

/**GETTERS AND SETTERS ******************************************************************************* */

    public Civilization getCivilization() {
        return civilization;
    }
    public void setCivilization(Civilization civilization) {
        this.civilization = civilization;
    }
    public List<Character> getInhabitants() {
        return inhabitants;
    }
    public void setInhabitants(List<Character> inhabitants) {
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

    /* 
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
    */
    public ArrayList<Structure> getStructures() {
        return structures;
    }
    public void setStructures(ArrayList<Structure> structures) {
        this.structures = structures;
    }
    
}
