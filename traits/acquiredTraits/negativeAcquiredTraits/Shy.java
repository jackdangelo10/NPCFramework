package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Shy extends Trait
{

    public Shy()
    {
        setChance(.15);
        setInheritable(false);
        setTraitName("Shy");
        addOpposite("Proud");
    }

    public void modifyCharacter(characters.Character c) 
    {
        c.setBaseRep(c.getBaseReputation() - 20);
    }

    public void revertCharacter(characters.Character c) 
    {
        c.setBaseRep(c.getBaseReputation() + 20);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}