package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;
import helper.NormalRandom;

public class InvoluntarilyCelibate extends Trait
{

    public InvoluntarilyCelibate()
    {
        setChance(.01);
        setInheritable(false);
        setTraitName("Involuntarily Celibate");
        addOpposite("Prolific");
    }

    public void apply(characters.Character c) 
    {
        c.setFertility(0);
        c.setCHR(c.getCHR() - 3);
        c.setBaseReputation(c.getBaseReputation() - 15);
    }

    public void unapply(characters.Character c) 
    {
        NormalRandom rand100 = new NormalRandom(3, 50);
        c.setFertility(rand100.randomNum(1, 100));
        c.setCHR(c.getCHR() + 3);
        c.setBaseReputation(c.getBaseReputation() + 15);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
