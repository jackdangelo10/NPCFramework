package traits.geneticTraits.negativeGeneticTraits;
import traits.Trait;

public class Grotesque extends Trait
{
    public Grotesque()
    {
        setChance(.05);
        setTraitName("Grotesque");
        addOpposite("Ugly");
        addOpposite("Attractive");
        addOpposite("Gorgeous");
    }

    public void apply(characters.Character c)
    {
        c.setCHR(c.getCHR() - 2);
        c.setBaseSway(c.getBaseSway() - 10);
    }

    public void unapply(characters.Character c)
    {
        c.setCHR(c.getCHR() + 2);
        c.setBaseSway(c.getBaseSway() + 10);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }

}
