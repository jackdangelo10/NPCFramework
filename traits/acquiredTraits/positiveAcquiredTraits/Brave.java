package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Brave extends Trait
{

    public Brave()
    {
        setChance(.15);
        setInheritable(false);
        setTraitName("Brave");
        addOpposite("Craven");
    }

    public void apply(characters.Character c)
    {
        c.setBaseSway(c.getBaseSway() + 5);
    }

    public void unapply(characters.Character c) 
    {
        c.setBaseSway(c.getBaseSway() - 5);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
