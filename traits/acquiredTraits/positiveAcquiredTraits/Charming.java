package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Charming extends Trait
{

    public Charming()
    {
        setChance(.15);
        setInheritable(false);
        setTraitName("Charming");
        addOpposite("Awkward");
        addOpposite("Shy");
    }

    public void apply(characters.Character c)
    {
        c.setBaseSway(c.getBaseSway() + 17);
        c.setCHR(c.getCHR() + 1);
    }

    public void unapply(characters.Character c) 
    {
        c.setBaseSway(c.getBaseSway() - 17);
        c.setCHR(c.getCHR() - 1);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}

