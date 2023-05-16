package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Slothful extends Trait
{

    public Slothful()
    {
        setChance(.15);
        setInheritable(false);
        setTraitName("Slothful");
        addOpposite("Disciplined");
    }

    public void apply(characters.Character c) 
    {
        c.setBaseSway(c.getBaseSway() - 15);
        c.setCHR(c.getCHR() - 2);
    }

    public void unapply(characters.Character c) 
    {
        c.setBaseSway(c.getBaseSway() + 15);
        c.setCHR(c.getCHR() + 2);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
