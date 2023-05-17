package traits.geneticTraits;

import java.util.ArrayList;
import java.util.Random;

import traits.Trait;
import traits.geneticTraits.negativeGeneticTraits.NegativeGeneticTraitGenerator;
import traits.geneticTraits.neutralGeneticTraits.NeutralGeneticTraitGenerator;
import traits.geneticTraits.positiveGeneticTraits.PositiveGeneticTraitGenerator;

public class GeneticTraitGenerator 
{
    private static ArrayList<Trait> geneticTraits;
    private static Random random;

    public GeneticTraitGenerator()
    {
        geneticTraits = new ArrayList<Trait>();
        random = new Random();

        geneticTraits.addAll(new PositiveGeneticTraitGenerator().getList());
        geneticTraits.addAll(new NegativeGeneticTraitGenerator().getList());
        geneticTraits.addAll(new NeutralGeneticTraitGenerator().getList());
    }

    public static Trait generateRandomTrait()
    {
        if (geneticTraits.isEmpty()) 
        {
            return null;
        }
        
        int index = random.nextInt(geneticTraits.size());
        return geneticTraits.get(index);
    }

    public static ArrayList<Trait> getList()
    {
        return geneticTraits;
    }  
}
