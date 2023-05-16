package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Prophet extends Trait
{

    public Prophet()
    {
        setChance(.05);
        setInheritable(false);
        setTraitName("Prophet");
        addOpposite("Cynical");
    }

    public void modifyCharacter(characters.Character c) {}

    public void revertCharacter(characters.Character c) {}

    public boolean satisfyAllConditions(characters.Character c)
    {
        if(c.getTraitList().contains("Zealous"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
