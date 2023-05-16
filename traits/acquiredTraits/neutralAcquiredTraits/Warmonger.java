package traits.acquiredTraits.neutralAcquiredTraits;
import traits.*;

public class Warmonger extends Trait
{

    public Warmonger()
    {
        setChance(.1);
        setInheritable(false);
        setTraitName("Warmonger ");
        addOpposite("Pacifist");
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
