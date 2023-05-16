package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Humble extends Trait
{

    public Humble()
    {
        setChance(.1);
        setInheritable(false);
        setTraitName("Humble");
        addOpposite("Proud");
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
