package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Just extends Trait
{

    public Just()
    {
        setChance(.15);
        setInheritable(false);
        setTraitName("Just");
        addOpposite("Impatient");
    }

    public void modifyCharacter(characters.Character c) 
    {
        c.setBaseRep(c.getBaseReputation() + 15);
    }

    public void revertCharacter(characters.Character c) 
    {
        c.setBaseRep(c.getBaseReputation() - 15);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
