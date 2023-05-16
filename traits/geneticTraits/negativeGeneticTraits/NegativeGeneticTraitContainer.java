package traits.geneticTraits.negativeGeneticTraits;
import traits.*;
import java.util.ArrayList;

public class NegativeGeneticTraitContainer 
{
    private static ArrayList<Trait> negativeTraits = new ArrayList<Trait>(6);

    public NegativeGeneticTraitContainer()
    {
        negativeTraits.clear();
        negativeTraits.add(new Slow()); //0
        negativeTraits.add(new Incapable()); //1
        negativeTraits.add(new Weak()); //2
        negativeTraits.add(new Ugly()); //3
        negativeTraits.add(new Grotesque()); //4
        negativeTraits.add(new Dwarf()); //5
    }

    public ArrayList<Trait> getList()
    {
        return negativeTraits;
    }  
}
