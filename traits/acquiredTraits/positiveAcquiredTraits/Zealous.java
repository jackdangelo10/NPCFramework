package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Zealous extends Trait
{

    public Zealous()
    {
        setChance(.1);
        setInheritable(false);
        setTraitName("Zealous");
        addOpposite("Cynical");
    }

    public void apply(characters.Character c) {}
    public void unapply(characters.Character c) {}

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}

