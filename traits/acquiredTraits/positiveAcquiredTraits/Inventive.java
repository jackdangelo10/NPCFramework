package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Inventive extends Trait
{

    public Inventive()
    {
        setChance(.05);
        setInheritable(false);
        setTraitName("Inventive");
        addOpposite("Slow");
        addOpposite("Incapable");
    }

    public void modifyCharacter(characters.Character c) 
    {
        c.setINT(c.getINT() + 2);
    }

    public void revertCharacter(characters.Character c) 
    {
        c.setINT(c.getINT() - 2);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
