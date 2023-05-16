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

    public void apply(characters.Character c)
    {
        c.setSTR(c.getSTR() - 2);
    }

    public void unapply(characters.Character c)
    {
        c.setSTR(c.getSTR() + 2);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
