package professions;
import java.util.ArrayList;
import java.util.Random;

public class ProfessionGenerator 
{
    private static ArrayList<Profession> professions;
    private static Random random;

    public ProfessionGenerator()
    {
        professions = new ArrayList<Profession>();
        random = new Random();

        professions.add(new Fisher());
        professions.add(new Rider());
        professions.add(new Preacher());
        professions.add(new Scholar());
        professions.add(new Theologian());
        professions.add(new HolyWarrior());
        professions.add(new Mercenary());
        professions.add(new Guard());
        professions.add(new Drunkard());
        professions.add(new Physician());
        professions.add(new Banker());
        professions.add(new Farmer());
        professions.add(new Politician());
        professions.add(new Potterer());
        professions.add(new Carpenter());
        professions.add(new Artist());
        professions.add(new Pilgrim());
        professions.add(new Monk());
        professions.add(new Blacksmith());
        professions.add(new Judge());
        professions.add(new Merchant());
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
}
