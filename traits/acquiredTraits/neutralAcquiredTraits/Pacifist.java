package traits.acquiredTraits.neutralAcquiredTraits;
import traits.*;

public class Pacifist extends Trait
{

    public Pacifist()
    {
        setChance(.1);
        setInheritable(false);
        setTraitName("Pacifist");
        addOpposite("Warmonger");
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
