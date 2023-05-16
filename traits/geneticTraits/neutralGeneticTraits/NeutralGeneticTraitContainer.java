package traits.geneticTraits.neutralGeneticTraits;
import java.util.ArrayList;
import traits.Trait;

public class NeutralGeneticTraitContainer 
{
    private static ArrayList<Trait> neutralTraits = new ArrayList<Trait>(2);

    public NeutralGeneticTraitContainer()
    {
        neutralTraits.clear();
        neutralTraits.add(new Homosexual()); //0
        neutralTraits.add(new Inbred()); //1
    }

    public ArrayList<Trait> getList()
    {
        return neutralTraits;
    }  
}
