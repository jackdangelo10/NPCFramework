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
