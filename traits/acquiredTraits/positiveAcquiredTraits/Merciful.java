package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Merciful extends Trait
{

    public Merciful()
    {
        setChance(.1);
        setInheritable(false);
        setTraitName("Merciful");
        addOpposite("Cruel");
    }

    public void modifyCharacter(characters.Character c) {}
    public void revertCharacter(characters.Character c) {}

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
