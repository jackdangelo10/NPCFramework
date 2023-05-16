package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Cruel extends Trait
{

    public Cruel()
    {
        setChance(.05);
        setInheritable(false);
        setTraitName("Cruel");
        addOpposite("Compassionate");
    }

    public void modifyCharacter(characters.Character c) 
    {
        c.setBaseSway(c.getBaseSway() + 10);
    }

    public void revertCharacter(characters.Character c) 
    {
        c.setBaseSway(c.getBaseSway() - 10);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}

