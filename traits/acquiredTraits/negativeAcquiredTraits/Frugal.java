package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Frugal extends Trait
{

    public Frugal()
    {
        setChance(.1);
        setInheritable(false);
        setTraitName("Frugal");
        addOpposite("Generous");
    }

    public void modifyCharacter(characters.Character c) 
    {
        c.setBaseSway(c.getBaseSway() - 5);
        c.setBaseRep(c.getBaseReputation() - 7);
    }

    public void revertCharacter(characters.Character c) 
    {
        c.setBaseSway(c.getBaseSway() + 5);
        c.setBaseRep(c.getBaseReputation() + 7);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
