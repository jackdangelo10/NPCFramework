package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Frugal extends Trait
{

    public Frugal()
    {
        setChance(.1);
        setInheritable(false);
        setTraitName("Frugal");
        addOpposite("Generous");
    }

    public void apply(characters.Character c) 
    {
        c.setBaseSway(c.getBaseSway() - 5);
        c.setBaseReputation(c.getBaseReputation() - 7);
    }

    public void unapply(characters.Character c) 
    {
        c.setBaseSway(c.getBaseSway() + 5);
        c.setBaseReputation(c.getBaseReputation() + 7);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
