package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Prolific extends Trait
{

    public Prolific()
    {
        setChance(.1);
        setInheritable(false);
        setTraitName("Prolific");
        addOpposite("Involuntarily Celibate");
        addOpposite("Celibate");
    }

    public void apply(characters.Character c) 
    {
        c.setCHR(c.getCHR() + 1);
        c.setFertility(c.getFertility() + 20);
    }

    public void unapply(characters.Character c) 
    {
        c.setCHR(c.getCHR() - 1);
        c.setFertility(c.getFertility() - 20);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
