package traits.acquiredTraits.neutralAcquiredTraits;
import traits.*;
import java.util.ArrayList;

public class NeutralAcquiredTraitContainer 
{
    private static ArrayList<Trait> neutralTraits = new ArrayList<Trait>();

    public NeutralAcquiredTraitContainer()
    {
        neutralTraits.clear();
        neutralTraits.add(new Excommunicated()); //0
        neutralTraits.add(new Nationalist()); //1
        neutralTraits.add(new Pacifist()); //2
        neutralTraits.add(new Warmonger()); //3
        neutralTraits.add(new Pregnant()); //4
        neutralTraits.add(new Scarred()); //5
        neutralTraits.add(new Celibate()); //6
    }

    public ArrayList<Trait> getList()
    {
        return neutralTraits;
    }   
}
