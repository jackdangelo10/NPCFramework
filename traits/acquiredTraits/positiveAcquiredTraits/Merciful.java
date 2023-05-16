package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Merciful extends Trait
{

    public Merciful()
    {
        setChance(.1);
        setInheritable(false);
        setTraitName("Merciful");
        addOpposite("Cruel");
    }

    public void apply(characters.Character c) {}
    public void unapply(characters.Character c) {}

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
