package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Disciplined extends Trait
{

    public Disciplined()
    {
        setChance(.15);
        setInheritable(false);
        setTraitName("Disciplined");
        addOpposite("Slothful");
    }

    public void modifyCharacter(characters.Character c) {}

    public void revertCharacter(characters.Character c) {}

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}

