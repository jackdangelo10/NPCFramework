package traits.geneticTraits.negativeGeneticTraits;

import traits.*;

public class Dwarf extends Trait
{

    public Dwarf()
    {
        setChance(.001);
        setTraitName("Dwarf");
        addOpposite("Giant");
    }

    public void apply(characters.Character c)
    {
        c.setSTR(10 - (int)(Math.random() * 5));
        c.setBaseSway(c.getBaseSway() - 7);
    }

    public void unapply(characters.Character c)
    {
        c.setSTR(10 + (int)(Math.random() * 5));
        c.setBaseSway(c.getBaseSway() + 7);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
