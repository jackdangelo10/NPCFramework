package traits.acquiredTraits.neutralAcquiredTraits;
import traits.*;
import helper.NormalRandom;

public class Celibate extends Trait
{

    public Celibate()
    {
        setChance(.03);
        setInheritable(false);
        setTraitName("Celibate");
        addOpposite("Prolific");
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setFertility(0);
    }

    public void revertCharacter(characters.Character c) 
    {
        NormalRandom rand100 = new NormalRandom(3, 50);
        c.setFertility(rand100.randomNum(1, 100));
        c.setBaseRep(c.getBaseReputation() - 10);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
