package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Stressed extends Trait
{

    public Stressed()
    {
        setChance(.15);
        setInheritable(false);
        setTraitName("Stressed");
        addOpposite("Depressed");
    }

    public void apply(characters.Character c) {}

    public void unapply(characters.Character c) {}

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
