package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Kinslayer extends Trait
{

    public Kinslayer()
    {
        setChance(.02);
        setInheritable(false);
        setTraitName("Kinslayer");
    }

    public void modifyCharacter(characters.Character c) 
    {
        c.setBaseRep(c.getBaseReputation() + 5);
        c.setBaseSway(c.getBaseSway() - 25);
    }

    public void revertCharacter(characters.Character c) 
    {
        c.setBaseRep(c.getBaseReputation() - 5);
        c.setBaseSway(c.getBaseSway() + 20);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
