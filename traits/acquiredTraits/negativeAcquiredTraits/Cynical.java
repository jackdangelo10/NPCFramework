package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Cynical extends Trait
{

    public Cynical()
    {
        setChance(.1);
        setInheritable(false);
        setTraitName("Cynical");
        addOpposite("Zealous");
    }

    public void modifyCharacter(characters.Character c) 
    {
        c.setPER(c.getPER() + 2);
    }

    public void revertCharacter(characters.Character c) 
    {
        c.setPER(c.getPER() - 2);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
