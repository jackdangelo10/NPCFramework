package traits.geneticTraits.negativeGeneticTraits;
import traits.*;
import java.util.ArrayList;
import java.util.Random;

public class NegativeGeneticTraitGenerator 
{
    private static ArrayList<Trait> negativeTraits;
    private static Random random;

    public NegativeGeneticTraitGenerator()
    {
        negativeTraits = new ArrayList<>();
        random = new Random();

        negativeTraits.add(new Slow()); //0
        negativeTraits.add(new Incapable()); //1
        negativeTraits.add(new Weak()); //2
        negativeTraits.add(new Ugly()); //3
        negativeTraits.add(new Grotesque()); //4
        negativeTraits.add(new Dwarf()); //5
    }

    public Trait generateRandomTrait()
    {
        if (negativeTraits.isEmpty()) 
        {
            return null;
        }
        
        int index = random.nextInt(negativeTraits.size());
        return negativeTraits.get(index);
    }

    public ArrayList<Trait> getList()
    {
        return negativeTraits;
    }  
}
