package traits.geneticTraits.neutralGeneticTraits;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import traits.Trait;

public class NeutralGeneticTraitGenerator 
{
    private static List<Trait> neutralTraits;
    private static Random random;

    public NeutralGeneticTraitGenerator()
    {
        neutralTraits = new ArrayList<Trait>(2);
        random = new Random();

        neutralTraits.add(new Homosexual()); //0
        neutralTraits.add(new Inbred()); //1
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
