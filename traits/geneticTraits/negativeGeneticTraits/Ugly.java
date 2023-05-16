package traits.geneticTraits.negativeGeneticTraits;
import traits.*;

public class Ugly extends Trait
{

    public Ugly()
    {
        setChance(.15);
        setTraitName("Ugly");
        addOpposite("Gorgeous");
        addOpposite("Attractive");
        addOpposite("Grotesque");
    }

    public void apply(characters.Character c)
    {
        c.setCHR(c.getCHR() - 1);
        c.setBaseSway(c.getBaseSway() - 5);
    }

    public void unapply(characters.Character c)
    {
        c.setCHR(c.getCHR() + 1);
        c.setBaseSway(c.getBaseSway() + 5);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
