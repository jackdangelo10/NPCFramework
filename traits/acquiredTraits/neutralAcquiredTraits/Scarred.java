package traits.acquiredTraits.neutralAcquiredTraits;
import traits.*;

public class Scarred extends Trait
{

    public Scarred()
    {
        setChance(.05);
        setInheritable(false);
        setTraitName("Scarred");
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setBaseRep(c.getBaseReputation() + 5);
    }

    public void revertCharacter(characters.Character c) 
    {
        c.setBaseRep(c.getBaseReputation() - 5);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
