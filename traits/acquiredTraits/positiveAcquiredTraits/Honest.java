package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Honest extends Trait
{

    public Honest()
    {
        setChance(.1);
        setInheritable(false);
        setTraitName("Honest");
        addOpposite("Deceitful");
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setBaseSway(c.getBaseSway() + 5);
        c.setCHR(c.getCHR() + 1);
        c.setBaseRep(c.getBaseReputation() + 10);
    }

    public void revertCharacter(characters.Character c) 
    {
        c.setBaseSway(c.getBaseSway() - 5);
        c.setCHR(c.getCHR() - 1);
        c.setBaseRep(c.getBaseReputation() - 10);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
