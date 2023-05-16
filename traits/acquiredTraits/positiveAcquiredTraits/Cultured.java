package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Cultured extends Trait
{

    public Cultured()
    {
        setChance(.15);
        setInheritable(false);
        setTraitName("Cultured");
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

