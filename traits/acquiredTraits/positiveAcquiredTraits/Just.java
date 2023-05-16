package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Just extends Trait
{

    public Just()
    {
        setChance(.15);
        setInheritable(false);
        setTraitName("Just");
        addOpposite("Impatient");
    }

    public void apply(characters.Character c) 
    {
        c.setBaseReputation(c.getBaseReputation() + 15);
    }

    public void unapply(characters.Character c) 
    {
        c.setBaseReputation(c.getBaseReputation() - 15);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
