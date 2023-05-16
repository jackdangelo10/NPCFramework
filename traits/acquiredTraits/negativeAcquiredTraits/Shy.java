package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Shy extends Trait
{

    public Shy()
    {
        setChance(.15);
        setInheritable(false);
        setTraitName("Shy");
        addOpposite("Proud");
    }

    public void apply(characters.Character c) 
    {
        c.setBaseReputation(c.getBaseReputation() - 20);
    }

    public void unapply(characters.Character c) 
    {
        c.setBaseReputation(c.getBaseReputation() + 20);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}