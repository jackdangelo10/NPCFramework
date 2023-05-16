package traits.acquiredTraits.neutralAcquiredTraits;
import traits.*;

public class Warmonger extends Trait
{

    public Warmonger()
    {
        setChance(.1);
        setInheritable(false);
        setTraitName("Warmonger ");
        addOpposite("Pacifist");
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
