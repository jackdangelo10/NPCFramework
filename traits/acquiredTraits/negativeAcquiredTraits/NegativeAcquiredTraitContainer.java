package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;
import java.util.ArrayList;

public class NegativeAcquiredTraitContainer 
{
    private static ArrayList<Trait> negativeTraits = new ArrayList<Trait>();

    public NegativeAcquiredTraitContainer()
    {
        negativeTraits.clear();
        negativeTraits.add(new Craven()); //0
        negativeTraits.add(new Awkward()); //1
        negativeTraits.add(new Selfish()); //2
        negativeTraits.add(new Slothful()); //3
        negativeTraits.add(new Overweight()); //4
        negativeTraits.add(new Frail()); //5
        negativeTraits.add(new Impatient()); //6
        negativeTraits.add(new Cruel()); //7
        negativeTraits.add(new Shy()); //8
        negativeTraits.add(new Depressed()); //9
        negativeTraits.add(new Stressed()); //10
        negativeTraits.add(new Deranged()); //11
        negativeTraits.add(new Wounded()); //12
        negativeTraits.add(new Infected()); //13
        negativeTraits.add(new InvoluntarilyCelibate()); //14
        negativeTraits.add(new Cynical()); //15
        negativeTraits.add(new Paranoid()); //16
        negativeTraits.add(new Blinded()); //17
        negativeTraits.add(new Deceitful()); //18
        negativeTraits.add(new Frugal()); //19
        negativeTraits.add(new Kinslayer()); //20


    }

    public ArrayList<Trait> getList()
    {
        return negativeTraits;
    }  

}
