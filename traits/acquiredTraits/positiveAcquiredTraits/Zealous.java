package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Zealous extends Trait
{

    public Zealous()
    {
        setChance(.1);
        setInheritable(false);
        setTraitName("Zealous");
        addOpposite("Cynical");
    }

    public void modifyCharacter(characters.Character c) {}
    public void revertCharacter(characters.Character c) {}

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}

