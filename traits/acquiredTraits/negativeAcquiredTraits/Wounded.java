package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Wounded extends Trait
{

    public Wounded()
    {
        setChance(.05);
        setInheritable(false);
        setTraitName("Wounded");
    }

    public void apply(characters.Character c) 
    {
        c.setCHR(c.getCON() - 5);
    }

    public void unapply(characters.Character c) 
    {
        c.setCHR(c.getCON() + 5);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
