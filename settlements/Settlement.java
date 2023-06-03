package settlements;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import characters.Family;
import characters.NPC;
import civilizations.Civilization;
import economies.SettlementEconomy;
import structures.House;
import structures.Structure;
import characters.Character;

abstract public class Settlement 
{
    protected Civilization civilization = null;

    //demographics
    protected List<Character> inhabitants = new ArrayList<Character>();
    protected List<Family> families = new ArrayList<Family>();
    protected List<Character> unemployed = new ArrayList<Character>();
    protected Queue<Character> unhoused = new LinkedList<Character>();
    protected String settlementName;
    protected String settlementAdjective;
    protected String settlementSizeName;
    protected int MAX_STRUCTURES = 0;
    protected int MIN_STRUCTURES = 0;

    
    protected SettlementEconomy economy = new SettlementEconomy();
    //protected LocalGovernment government = null;
    protected ArrayList<Structure> structures = new ArrayList<Structure>();
    protected House housing = new House();

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

    public int getMAX_STRUCTURES() {
        return MAX_STRUCTURES;
    }

    public void setMAX_STRUCTURES(int mAX_STRUCTURES) {
        MAX_STRUCTURES = mAX_STRUCTURES;
    }

    public int getMIN_STRUCTURES() {
        return MIN_STRUCTURES;
    }

    public void setMIN_STRUCTURES(int mIN_STRUCTURES) {
        MIN_STRUCTURES = mIN_STRUCTURES;
    }

    public List<Character> getUnemployed() {
        return unemployed;
    }

    public void setUnemployed(List<Character> unemployed) {
        this.unemployed = unemployed;
    }

    public House getHousing() {
        return housing;
    }

    public void setHousing(House housing) {
        this.housing = housing;
    }

    public Queue<Character> getUnhoused() {
        return unhoused;
    }

    public void setUnhoused(Queue<Character> unhoused) {
        this.unhoused = unhoused;
    }

    public SettlementEconomy getEconomy() {
        return economy;
    }

    public void setEconomy(SettlementEconomy economy) {
        this.economy = economy;
    }

}
