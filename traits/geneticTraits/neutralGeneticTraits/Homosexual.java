package traits.geneticTraits.neutralGeneticTraits;
import traits.*;
import helper.NormalRandom;

public class Homosexual extends Trait
{
    private static final NormalRandom rand100 = new NormalRandom(3, 50);
    
    public Homosexual()
    {
        setChance(.03);
        setTraitName("Homosexual");
    }

    public void apply(characters.Character c)
    {
        c.setFertility(0);
    }

    public void unapply(characters.Character c) 
    {
        c.setFertility(rand100.randomNum(1, 100));
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
