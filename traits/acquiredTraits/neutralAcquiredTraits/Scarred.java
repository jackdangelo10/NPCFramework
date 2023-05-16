package traits.acquiredTraits.neutralAcquiredTraits;
import traits.*;

public class Scarred extends Trait
{

    public Scarred()
    {
        setChance(.05);
        setInheritable(false);
        setTraitName("Scarred");
    }

    public void apply(characters.Character c)
    {
        c.setBaseReputation(c.getBaseReputation() + 5);
    }

    public void unapply(characters.Character c) 
    {
        c.setBaseReputation(c.getBaseReputation() - 5);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
