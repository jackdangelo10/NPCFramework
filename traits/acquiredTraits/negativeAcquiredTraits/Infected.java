package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Infected extends Trait
{

    public Infected()
    {
        setChance(0);
        setInheritable(false);
        setTraitName("Infected");
    }

    public void modifyCharacter(characters.Character c) {}

    public void revertCharacter(characters.Character c) {}

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
