package traits.acquiredTraits.neutralAcquiredTraits;
import traits.*;

public class Nationalist extends Trait
{

    public Nationalist()
    {
        setChance(.1);
        setInheritable(false);
        setTraitName("Nationalist");
    }

    public void apply(characters.Character c)
    {
        c.setBaseReputation(c.getBaseReputation() + 10);
    }

    public void unapply(characters.Character c) 
    {
        c.setBaseReputation(c.getBaseReputation() - 10);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
