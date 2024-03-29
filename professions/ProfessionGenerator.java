package professions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//class to keep track of and generate professions in a map
//will implement a more efficient design where the profession generator is a singleton class that returns clones
//of the professions
public class ProfessionGenerator 
{
    private static ArrayList<Profession> professions;
    private static Map<String, Profession> professionMap = new HashMap<String,Profession>();
    private static Random random;

    public ProfessionGenerator()
    {
        professions = new ArrayList<Profession>();
        random = new Random();

        Profession fisher = new Fisher();
        Profession stablehand = new Stablehand();
        Profession preacher = new Preacher();
        Profession scholar = new Scholar();
        Profession holywarrior = new HolyWarrior();
        Profession mercenary = new Mercenary();
        Profession guard = new Guard();
        Profession drunkard = new Drunkard();
        Profession physician = new Physician();
        Profession banker = new Banker();
        Profession farmer = new Farmer();
        Profession politician = new Politician();
        Profession carpenter = new Carpenter();
        Profession potterer = new Potterer();
        Profession artist = new Artist();
        Profession pilgrim = new Pilgrim();
        Profession monk = new Monk();
        Profession blacksmith = new Blacksmith();
        Profession judge = new Judge();
        Profession merchant = new Merchant();
        Profession alchemist = new Alchemist();
        Profession brewer = new Brewer();
        Profession weaver = new Weaver();
        Profession miner = new Miner();
        Profession barkeeper = new Barkeeper();
        Profession hedonist = new Hedonist();
        Profession miller = new Miller();
        Profession castellan = new Castellan();
        Profession worker = new Worker();
        Profession steward = new Steward();

        professions.add(fisher);
        professions.add(stablehand);
        professions.add(preacher);
        professions.add(scholar);
        professions.add(holywarrior);
        professions.add(mercenary);
        professions.add(guard);
        professions.add(drunkard);
        professions.add(physician);
        professions.add(banker);
        professions.add(farmer);
        professions.add(politician);
        professions.add(potterer);
        professions.add(carpenter);
        professions.add(artist);
        professions.add(pilgrim);
        professions.add(monk);
        professions.add(blacksmith);
        professions.add(judge);
        professions.add(merchant);
        professions.add(alchemist);
        professions.add(brewer);
        professions.add(weaver);
        professions.add(miner);
        professions.add(barkeeper);
        professions.add(hedonist);
        professions.add(miller);
        professions.add(castellan);
        professions.add(worker);
        professions.add(steward);

        professionMap.put("Fisher", fisher);
        professionMap.put("Stablehand", stablehand);
        professionMap.put("Preacher", preacher);
        professionMap.put("Scholar", scholar);
        professionMap.put("Holy Warrior", holywarrior);
        professionMap.put("Mercenary", mercenary);
        professionMap.put("Guard", guard);
        professionMap.put("Drunkard", drunkard);
        professionMap.put("Physician", physician);
        professionMap.put("Banker", banker);
        professionMap.put("Farmer", farmer);
        professionMap.put("Politician", politician);
        professionMap.put("Potterer", potterer);
        professionMap.put("Carpenter", carpenter);
        professionMap.put("Artist", artist);
        professionMap.put("Pilgrim", pilgrim);
        professionMap.put("Monk", monk);
        professionMap.put("Blacksmith", blacksmith);
        professionMap.put("Judge", judge);
        professionMap.put("Merchant", merchant);
        professionMap.put("Alchemist", alchemist);
        professionMap.put("Brewer", brewer);
        professionMap.put("Weaver", weaver);
        professionMap.put("Miner", miner);
        professionMap.put("Barkeeper", barkeeper);
        professionMap.put("Hedonist", hedonist);
        professionMap.put("Miller", miller);
        professionMap.put("Castellan", castellan);
        professionMap.put("Worker", worker);
        professionMap.put("Steward", steward);
    }

    public Profession generateRandomProfession()
    {
        if (professions.isEmpty()) 
        {
            return null;
        }
        
        int index = random.nextInt(professions.size());
        return professions.get(index);
    }

    public ArrayList<Profession> getList()
    {
        return professions;
    }

    public static ArrayList<Profession> getProfessions() {
        return professions;
    }

    public static void setProfessions(ArrayList<Profession> professions) {
        ProfessionGenerator.professions = professions;
    }

    public Map<String, Profession> getProfessionMap() {
        return professionMap;
    }

    public static void setProfessionMap(Map<String, Profession> professionMap) {
        ProfessionGenerator.professionMap = professionMap;
    }

    public static Random getRandom() {
        return random;
    }

    public static void setRandom(Random random) {
        ProfessionGenerator.random = random;
    }  

    

    
}
