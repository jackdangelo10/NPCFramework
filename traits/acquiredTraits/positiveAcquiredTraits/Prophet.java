package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Prophet extends Trait
{

    public Prophet()
    {
        setChance(.05);
        setInheritable(false);
        setTraitName("Prophet");
        addOpposite("Cynical");
    }

    public void apply(characters.Character c) {}

    public void unapply(characters.Character c) {}

    public boolean meetsRequirements(characters.Character c)
    {
        if(c.getTraits().containsKey("Zealous"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
