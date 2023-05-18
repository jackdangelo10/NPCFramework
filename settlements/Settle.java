package settlements;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import characters.Family;
import characters.NPC;
import civilizations.Civilization;
import economies.LocalEconomy;
import governments.Democracy;
import governments.LocalGovernment;
import governments.Monarchy;
import governments.Oligarchy;
import resources.Resource;
import structures.Structure;

public abstract class Settlement 
{
    protected Civilization civilization = null;

    protected ArrayList<NPC> inhabitants = new ArrayList<NPC>();
    protected ArrayList<Family> families = new ArrayList<Family>();
    protected ArrayList<NPC> deadNPCS = new ArrayList<NPC>();
    protected ArrayList<NPC> additionBuffer = new ArrayList<NPC>();
    protected int INITIAL_POP_MAX = 0;


    protected String settlementName;
    protected String settlementAdjective;
    protected String settlementSizeName;
    protected static SettlementNameGenerator nGenerator = new SettlementNameGenerator();

    protected LocalEconomy economy = null;
    protected LocalGovernment government = null;
    protected ArrayList<Structure> structures = new ArrayList<Structure>();

    protected NPC localLeader = null;

    protected static final Random rand = new Random(); 
    
    abstract protected void initializeEconomy();

    public Settlement()
    {
        System.out.println("Initializing settlement...");
    }

    //string is resource id
    public void updateResource(String s, int delta)
    {
        Resource r = economy.getTree().searchResource(s);
        r.setResourceAmount(r.getResourceAmount() + delta);
    }


    protected void shuffleInhabitants()
    {
        Collections.shuffle(inhabitants);
    }

    public String getSettlementAdjective() {
        return settlementAdjective;
    }

    

    public String getSettlementSizeName() {
        return settlementSizeName;
    }
    public void setSettlementSizeName(String settlementSizeName) {
        this.settlementSizeName = settlementSizeName;
    }
    public void setSettlementAdjective(String settlementAdjective) {
        this.settlementAdjective = settlementAdjective;
    }

    public LocalEconomy getEconomy() {
        return economy;
    }

    public void setEconomy(LocalEconomy economy) {
        this.economy = economy;
    }

    protected void generatePopulation()
    {
        int popLeft = INITIAL_POP_MAX;
        while(popLeft > 0)
        {
            int familySize = rand.nextInt(5) + 1;
            if(familySize > popLeft)
            {
                familySize = popLeft;
            }
            Family f = new Family(familySize, civilization, this);
            inhabitants.addAll(f.getMembers());
            families.add(f);
            popLeft -= familySize;
        }
    }

    public void setINITIAL_POP_MAX(int iNITIAL_POP_MAX) {
        INITIAL_POP_MAX = iNITIAL_POP_MAX;
    }

    public int getINITIAL_POP_MAX() {
        return INITIAL_POP_MAX;
    }

    public void addInhabitant(NPC c)
    {
        inhabitants.add(c);
    }

    public ArrayList<NPC> getInhabitants() {
        return inhabitants;
    }
    public String getSettlementName() {
        return settlementName;
    }
    public void setInhabitants(ArrayList<NPC> inhabitants) {
        this.inhabitants = inhabitants;
    }
    public void setSettlementName(String settlementName) {
        this.settlementName = settlementName;
    }


    public LocalGovernment getGovernment() {
        return government;
    }
    public void setGovernment(LocalGovernment government) {
        this.government = government;
    }


    
    public NPC getLocalLeader() {
        return localLeader;
    }

    public void setLocalLeader(NPC localLeader) {
        this.localLeader = localLeader;
    }

    public ArrayList<Family> getFamilies() {
        return families;
    }
    public void setFamilies(ArrayList<Family> families) {
        this.families = families;
    }
    public void printInhabitants()
    {
        for(NPC i : inhabitants)
        {
            i.print();
            System.out.println("***************************");
            System.out.println();
        }
    }


    public void printEconomyDetails()
    {
        System.out.println("GPT: " + economy.getGoldPerTurn());
        System.out.println("IPT: " + economy.getInfluencePerTurn());
        System.out.println("MPT: " + economy.getManpowerPerTurn());
        System.out.println("FPT: " + economy.getFoodPerTurn());

        ArrayList<Resource> resources = economy.getTree().getContainer().getResources();
        for(Resource r : resources)
        {
            System.out.println("There are " + r.getResourceAmount() + " " 
                + r.getResourceName() + " priced at " + r.getCurrentPrice());
        }

    }

    public void printGovernmentDetails()
    {
        System.out.println(government.getGovType());
        if(government.getGovType() instanceof Democracy)
        {
            System.out.println(government.getGovType().getLeader().getName());
        }
        if(government.getGovType() instanceof Oligarchy)
        {

        }
        if(government.getGovType() instanceof Monarchy)
        {
            System.out.println(government.getGovType().getLeader().getName());
        }
    }
    public ArrayList<Structure> getStructures() {
        return structures;
    }
    public void setStructures(ArrayList<Structure> structures) {
        this.structures = structures;
    }

    
}
