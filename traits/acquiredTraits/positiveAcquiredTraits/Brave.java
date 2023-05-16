package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Brave extends Trait
{

    public Brave()
    {
        setChance(.15);
        setInheritable(false);
        setTraitName("Brave");
        addOpposite("Craven");
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
