package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Inventive extends Trait
{

    public Inventive()
    {
        setChance(.05);
        setInheritable(false);
        setTraitName("Inventive");
        addOpposite("Slow");
        addOpposite("Incapable");
    }

    public void apply(characters.Character c) 
    {
        c.setINT(c.getINT() + 2);
    }

    public void unapply(characters.Character c) 
    {
        c.setINT(c.getINT() - 2);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
