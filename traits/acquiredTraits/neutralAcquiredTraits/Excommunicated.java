package traits.acquiredTraits.neutralAcquiredTraits;
import traits.*;

public class Excommunicated extends Trait
{

    public Excommunicated()
    {
        setChance(.02);
        setInheritable(false);
        setTraitName("Excommunicated");
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

