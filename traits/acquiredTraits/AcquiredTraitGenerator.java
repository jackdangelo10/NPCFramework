package traits.acquiredTraits;

import traits.*;
import traits.acquiredTraits.negativeAcquiredTraits.NegativeAcquiredTraitGenerator;
import traits.acquiredTraits.neutralAcquiredTraits.NeutralAcquiredTraitGenerator;
import traits.acquiredTraits.positiveAcquiredTraits.PositiveAcquiredTraitGenerator;

import java.util.ArrayList;
import java.util.Random;

public class AcquiredTraitGenerator
{
    private static ArrayList<Trait> acquiredTraits;
    private static Random random;

    public AcquiredTraitGenerator()
    {
        acquiredTraits = new ArrayList<Trait>();
        random = new Random();

        acquiredTraits.addAll(new PositiveAcquiredTraitGenerator().getList());
        acquiredTraits.addAll(new NegativeAcquiredTraitGenerator().getList());
        acquiredTraits.addAll(new NeutralAcquiredTraitGenerator().getList());
    }

    public Trait generateRandomTrait()
    {
        if (acquiredTraits.isEmpty()) 
        {
            return null;
        }
        
        int index = random.nextInt(acquiredTraits.size());
        return acquiredTraits.get(index);
    }

    public static ArrayList<Trait> getList()
    {
        return acquiredTraits;
    }  
}
