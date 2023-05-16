package traits.acquiredTraits.neutralAcquiredTraits;
import traits.*;

public class Pacifist extends Trait
{

    public Pacifist()
    {
        setChance(.1);
        setInheritable(false);
        setTraitName("Pacifist");
        addOpposite("Warmonger");
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
