package traits.geneticTraits.positiveGeneticTraits;
import traits.*;
import java.util.ArrayList;

public class PositiveGeneticTraitContainer 
{
    private static ArrayList<Trait> positiveTraits = new ArrayList<Trait>(6);

    public PositiveGeneticTraitContainer()
    {
        positiveTraits.clear();
        positiveTraits.add(new Genius()); //0
        positiveTraits.add(new Clever()); //1
        positiveTraits.add(new Attractive()); //2
        positiveTraits.add(new Gorgeous()); //3
        positiveTraits.add(new Strong());//4
        positiveTraits.add(new Giant()); //5
    }

    public ArrayList<Trait> getList()
    {
        return positiveTraits;
    }  
}
