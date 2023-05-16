package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Overweight extends Trait
{

    public Overweight()
    {
        setChance(.05);
        setInheritable(false);
        setTraitName("Overweight");
        addOpposite("Frail");
    }

    public void apply(characters.Character c) 
    {
        c.setCON(c.getCON() - 3);
        c.setCHR(c.getCHR() - 1);
        c.setHealth(c.getHealth() - 10);
    }

    public void unapply(characters.Character c) 
    {
        c.setCON(c.getCON() + 3);
        c.setCHR(c.getCHR() + 1);
        c.setHealth(c.getHealth() + 10);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
