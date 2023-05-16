package traits.geneticTraits.negativeGeneticTraits;
import traits.*;

public class Slow extends Trait
{

    public Slow()
    {
        setChance(.1);
        setTraitName("Slow");
        addOpposite("Genius");
        addOpposite("Clever");
        addOpposite("Incapable");
    }

    public void apply(characters.Character c)
    {
        c.setINT(c.getINT() - 2);
        c.setBaseSway(c.getBaseSway() - 10);
    }

    public void unapply(characters.Character c)
    {
        c.setINT(c.getINT() + 2);
        c.setBaseSway(c.getBaseSway() + 10);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}