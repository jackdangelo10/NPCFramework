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

    public void modifyCharacter(characters.Character c)
    {
        c.setBaseSway(c.getBaseSway() + 5);
    }

    public void revertCharacter(characters.Character c) 
    {
        c.setBaseSway(c.getBaseSway() - 5);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}

