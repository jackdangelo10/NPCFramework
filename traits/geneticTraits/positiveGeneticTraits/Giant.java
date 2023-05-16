package traits.geneticTraits.positiveGeneticTraits;
import traits.*;

public class Giant extends Trait
{

    public Giant()
    {
        setChance(.02);
        setTraitName("Giant");
        addOpposite("Dwarf");
    }

    public void apply(characters.Character c)
    {
        c.setSTR(14 + (int)(Math.random() * 5));
        c.setBaseSway(c.getBaseSway() + 10);
    }

    public void unapply(characters.Character c)
    {
        c.setSTR(14 - (int)(Math.random() * 5));
        c.setBaseSway(c.getBaseSway() - 10);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
