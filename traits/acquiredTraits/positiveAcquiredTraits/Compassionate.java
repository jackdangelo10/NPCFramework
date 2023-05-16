package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Compassionate extends Trait
{

    public Compassionate()
    {
        setChance(.15);
        setInheritable(false);
        setTraitName("Compassionate");
        addOpposite("Selfish");
        addOpposite("Cruel");
    }

    public void modifyCharacter(characters.Character c) {}

    public void revertCharacter(characters.Character c) {}

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}

