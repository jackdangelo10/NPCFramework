package traits.geneticTraits.negativeGeneticTraits;
import traits.*;

public class Weak extends Trait
{
    public Weak()
    {
        setChance(.1);
        setTraitName("Weak");
        addOpposite("Strong");
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setSTR(c.getSTR() - 2);
    }

    public void revertCharacter(characters.Character c)
    {
        c.setSTR(c.getSTR() + 2);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
