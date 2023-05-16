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

    public void modifyCharacter(characters.Character c)
    {
        c.setFertility(0);
        c.setIsHomosexual(true);
    }

    public void revertCharacter(characters.Character c) 
    {
        c.setFertility(rand100.randomNum(1, 100));
        c.setIsHomosexual(false);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
