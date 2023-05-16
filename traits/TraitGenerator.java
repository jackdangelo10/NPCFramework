package traits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import traits.acquiredTraits.AcquiredTraitGenerator;
import traits.geneticTraits.GeneticTraitGenerator;

public class TraitGenerator 
{
    private static List<Trait> traits;
    private static Random random;

    public TraitGenerator()
    {
        traits = new ArrayList<>();
        random = new Random();

        traits.addAll(new AcquiredTraitGenerator().getList());
        traits.addAll(new GeneticTraitGenerator().getList());
        shuffle();
    }

    public Trait generateRandomTrait()
    {
        if (traits.isEmpty()) 
        {
            return null;
        }
        
        int index = random.nextInt(traits.size());
        return traits.get(index);
    }

    public List<Trait> getTraitList()
    {
        return traits;
    }

    private void shuffle()
    {
        Collections.shuffle(traits);
    }
}
