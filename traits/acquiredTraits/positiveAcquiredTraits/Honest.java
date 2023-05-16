package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Honest extends Trait
{

    public Honest()
    {
        setChance(.1);
        setInheritable(false);
        setTraitName("Honest");
        addOpposite("Deceitful");
    }

    public void apply(characters.Character c)
    {
        c.setBaseSway(c.getBaseSway() + 5);
        c.setCHR(c.getCHR() + 1);
        c.setBaseReputation(c.getBaseReputation() + 10);
    }

    public void unapply(characters.Character c) 
    {
        c.setBaseSway(c.getBaseSway() - 5);
        c.setCHR(c.getCHR() - 1);
        c.setBaseReputation(c.getBaseReputation() - 10);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
