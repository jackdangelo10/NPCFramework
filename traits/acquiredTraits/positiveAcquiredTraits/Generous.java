package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Generous extends Trait
{

    public Generous()
    {
        setChance(.1);
        setInheritable(false);
        setTraitName("Generous");
        addOpposite("Frugal");
    }

    public void modifyCharacter(characters.Character c) 
    {
        c.setBaseSway(c.getBaseSway() + 10);
        c.setBaseRep(c.getBaseReputation() + 10);
    }

    public void revertCharacter(characters.Character c) 
    {
        c.setBaseSway(c.getBaseSway() - 10);
        c.setBaseRep(c.getBaseReputation() - 10);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}