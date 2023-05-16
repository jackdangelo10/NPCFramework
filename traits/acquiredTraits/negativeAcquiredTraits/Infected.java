package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Infected extends Trait
{

    public Infected()
    {
        setChance(0);
        setInheritable(false);
        setTraitName("Infected");
    }

    public void apply(characters.Character c) {}

    public void unapply(characters.Character c) {}

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
