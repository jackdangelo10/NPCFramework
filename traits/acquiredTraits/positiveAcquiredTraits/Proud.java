package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Proud extends Trait
{

    public Proud()
    {
        setChance(.15);
        setInheritable(false);
        setTraitName("Proud");
        addOpposite("Humble");
        addOpposite("Craven");
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
