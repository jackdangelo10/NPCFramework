package traits.acquiredTraits.neutralAcquiredTraits;
import traits.*;

public class Nationalist extends Trait
{

    public Nationalist()
    {
        setChance(.1);
        setInheritable(false);
        setTraitName("Nationalist");
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setBaseRep(c.getBaseReputation() + 10);
    }

    public void revertCharacter(characters.Character c) 
    {
        c.setBaseRep(c.getBaseReputation() - 10);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
