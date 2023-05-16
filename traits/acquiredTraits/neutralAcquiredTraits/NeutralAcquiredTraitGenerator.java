package traits.acquiredTraits.neutralAcquiredTraits;
import traits.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NeutralAcquiredTraitGenerator 
{
    private static List<Trait> neutralTraits;
    private static Random random;

    public NeutralAcquiredTraitGenerator()
    {
        neutralTraits = new ArrayList<Trait>();
        random = new Random();

        neutralTraits.add(new Excommunicated()); //0
        neutralTraits.add(new Nationalist()); //1
        neutralTraits.add(new Pacifist()); //2
        neutralTraits.add(new Warmonger()); //3
        neutralTraits.add(new Pregnant()); //4
        neutralTraits.add(new Scarred()); //5
        neutralTraits.add(new Celibate()); //6
    }

    public Trait generateRandomTrait()
    {
        if (neutralTraits.isEmpty()) 
        {
            return null;
        }
        
        int index = random.nextInt(neutralTraits.size());
        return neutralTraits.get(index);
    }

    public List<Trait> getList()
    {
        return neutralTraits;
    }   
}
