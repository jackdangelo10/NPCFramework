package traits.geneticTraits.positiveGeneticTraits;
import traits.*;

public class Strong extends Trait
{
    public Strong()
    {
        setChance(.1);
        setTraitName("Strong");
        addOpposite("Weak");
        addOpposite("Frail");
    }

    public void apply(characters.Character c)
    {
        c.setSTR(c.getSTR() + 2);
    }

    public void unapply(characters.Character c)
    {
        c.setSTR(c.getSTR() - 2);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
