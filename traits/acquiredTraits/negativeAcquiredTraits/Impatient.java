package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Impatient extends Trait
{

    public Impatient()
    {
        setChance(.15);
        setInheritable(false);
        setTraitName("Impatient");
        addOpposite("Just");
    }

    public void modifyCharacter(characters.Character c) 
    {
        c.setPER(c.getPER() - 2);
    }

    public void revertCharacter(characters.Character c) 
    {
        c.setPER(c.getPER() + 2);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
