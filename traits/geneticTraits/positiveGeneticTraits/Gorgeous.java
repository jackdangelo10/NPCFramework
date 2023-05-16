package traits.geneticTraits.positiveGeneticTraits;
import traits.*;

public class Gorgeous extends Trait
{

    public Gorgeous()
    {
        setChance(.05);
        setTraitName("Gorgeous");
        addOpposite("Ugly");
        addOpposite("Grotesque");
        addOpposite("Attractive");
    }

    public void apply(characters.Character c)
    {
        c.setCHR(c.getCHR() + 2);
        c.setBaseSway(c.getBaseSway() + 10);
    }

    public void unapply(characters.Character c)
    {
        c.setCHR(c.getCHR() - 2);
        c.setBaseSway(c.getBaseSway() - 10);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
