package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Proud extends Trait
{

    public Proud()
    {
        setChance(.15);
        setInheritable(false);
        setTraitName("Proud");
        addOpposite("Humble");
        addOpposite("Craven");
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
