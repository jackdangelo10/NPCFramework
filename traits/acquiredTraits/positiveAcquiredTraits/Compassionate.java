package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Compassionate extends Trait
{

    public Compassionate()
    {
        setChance(.15);
        setInheritable(false);
        setTraitName("Compassionate");
        addOpposite("Selfish");
        addOpposite("Cruel");
    }

    public void apply(characters.Character c) {}

    public void unapply(characters.Character c) {}

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}

