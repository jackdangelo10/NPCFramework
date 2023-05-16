package traits.geneticTraits.positiveGeneticTraits;
import traits.*;

public class Clever extends Trait
{
    public Clever()
    {
        setChance(.1);
        setTraitName("Clever");
        addOpposite("Slow");
        addOpposite("Incapable");
        addOpposite("Genius");
    }

    public void apply(characters.Character c)
    {
        c.setINT(c.getINT() + 2);
        c.setBaseSway(c.getBaseSway() + 5);
    }

    public void unapply(characters.Character c)
    {
        c.setINT(c.getINT() - 2);
        c.setBaseSway(c.getBaseSway() - 5);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
