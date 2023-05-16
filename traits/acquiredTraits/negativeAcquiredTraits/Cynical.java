package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Cynical extends Trait
{

    public Cynical()
    {
        setChance(.1);
        setInheritable(false);
        setTraitName("Cynical");
        addOpposite("Zealous");
    }

    public void apply(characters.Character c) 
    {
        c.setPER(c.getPER() + 2);
    }

    public void unapply(characters.Character c) 
    {
        c.setPER(c.getPER() - 2);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
