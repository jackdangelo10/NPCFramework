package traits.acquiredTraits.neutralAcquiredTraits;
import traits.*;

public class Excommunicated extends Trait
{

    public Excommunicated()
    {
        setChance(.02);
        setInheritable(false);
        setTraitName("Excommunicated");
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

