package traits.geneticTraits.positiveGeneticTraits;
import traits.*;
import java.util.ArrayList;
import java.util.Random;

public class PositiveGeneticTraitGenerator 
{
    private static ArrayList<Trait> positiveTraits;
    private static Random random;

    public PositiveGeneticTraitGenerator()
    {
        positiveTraits  = new ArrayList<Trait>(6);
        random = new Random();

        positiveTraits.add(new Genius()); //0
        positiveTraits.add(new Clever()); //1
        positiveTraits.add(new Attractive()); //2
        positiveTraits.add(new Gorgeous()); //3
        positiveTraits.add(new Strong());//4
        positiveTraits.add(new Giant()); //5
    }

    public Trait generateRandomTrait()
    {
        if (positiveTraits.isEmpty()) 
        {
            return null;
        }
        
        int index = random.nextInt(positiveTraits.size());
        return positiveTraits.get(index);
    }

    public ArrayList<Trait> getList()
    {
        return positiveTraits;
    }  
}
