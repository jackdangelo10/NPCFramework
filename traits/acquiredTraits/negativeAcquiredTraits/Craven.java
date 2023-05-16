package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Craven extends Trait
{

    public Craven()
    {
        setChance(.15);
        setInheritable(false);
        setTraitName("Craven");
        addOpposite("Brave");
        addOpposite("Proud");
    }

    public void apply(characters.Character c) 
    {
        c.setBaseSway(c.getBaseSway() - 5);
        c.setCHR(c.getCHR() - 1);
    }

    public void unapply(characters.Character c) 
    {
        c.setBaseSway(c.getBaseSway() + 5);
        c.setCHR(c.getCHR() + 1);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
