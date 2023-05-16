package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Disciplined extends Trait
{

    public Disciplined()
    {
        setChance(.15);
        setInheritable(false);
        setTraitName("Disciplined");
        addOpposite("Slothful");
    }

    public void apply(characters.Character c) {}

    public void unapply(characters.Character c) {}

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}

