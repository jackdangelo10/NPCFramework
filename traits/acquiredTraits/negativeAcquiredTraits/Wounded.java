package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Wounded extends Trait
{

    public Wounded()
    {
        setChance(.05);
        setInheritable(false);
        setTraitName("Wounded");
    }

    public void modifyCharacter(characters.Character c) 
    {
        c.setCHR(c.getCON() - 5);
    }

    public void revertCharacter(characters.Character c) 
    {
        c.setCHR(c.getCON() + 5);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
