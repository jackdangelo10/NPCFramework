package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Kinslayer extends Trait
{

    public Kinslayer()
    {
        setChance(.02);
        setInheritable(false);
        setTraitName("Kinslayer");
    }

    public void apply(characters.Character c) 
    {
        c.setBaseReputation(c.getBaseReputation() + 5);
        c.setBaseSway(c.getBaseSway() - 25);
    }

    public void unapply(characters.Character c) 
    {
        c.setBaseReputation(c.getBaseReputation() - 5);
        c.setBaseSway(c.getBaseSway() + 20);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
