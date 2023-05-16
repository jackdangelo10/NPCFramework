package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Paranoid extends Trait
{

    public Paranoid()
    {
        setChance(.03);
        setInheritable(false);
        setTraitName("Paranoid");
    }

    public void apply(characters.Character c) 
    {
        c.setPER(c.getPER() - 2);
        c.setCHR(c.getCHR() - 1);
        c.setLCK(c.getLCK() + 3);
    }

    public void unapply(characters.Character c) 
    {
        c.setPER(c.getPER() + 2);
        c.setCHR(c.getCHR() + 1);
        c.setLCK(c.getLCK() - 3);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
