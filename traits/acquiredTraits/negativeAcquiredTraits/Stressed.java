package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Stressed extends Trait
{

    public Stressed()
    {
        setChance(.15);
        setInheritable(false);
        setTraitName("Stressed");
        addOpposite("Depressed");
    }

    public void modifyCharacter(characters.Character c) {}

    public void revertCharacter(characters.Character c) {}

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
