package traits.geneticTraits;

import java.util.ArrayList;

import traits.Trait;
import traits.geneticTraits.negativeGeneticTraits.NegativeGeneticTraitContainer;
import traits.geneticTraits.neutralGeneticTraits.NeutralGeneticTraitContainer;
import traits.geneticTraits.positiveGeneticTraits.PositiveGeneticTraitContainer;

public class GeneticTraitContainer 
{
    private static ArrayList<Trait> geneticTraits = new ArrayList<Trait>();

    public GeneticTraitContainer()
    {
        geneticTraits.clear();
        geneticTraits.addAll(new PositiveGeneticTraitContainer().getList());
        geneticTraits.addAll(new NegativeGeneticTraitContainer().getList());
        geneticTraits.addAll(new NeutralGeneticTraitContainer().getList());
    }

    public ArrayList<Trait> getList()
    {
        return geneticTraits;
    }  
}
