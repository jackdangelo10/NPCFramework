package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Generous extends Trait
{

    public Generous()
    {
        setChance(.1);
        setInheritable(false);
        setTraitName("Generous");
        addOpposite("Frugal");
    }

    public void apply(characters.Character c) 
    {
        c.setBaseSway(c.getBaseSway() + 10);
        c.setBaseReputation(c.getBaseReputation() + 10);
    }

    public void unapply(characters.Character c) 
    {
        c.setBaseSway(c.getBaseSway() - 10);
        c.setBaseReputation(c.getBaseReputation() - 10);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}