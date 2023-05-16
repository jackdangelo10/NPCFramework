package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Deceitful extends Trait
{

    public Deceitful()
    {
        setChance(.1);
        setInheritable(false);
        setTraitName("Deceitful");
        addOpposite("Honest");
    }

    public void modifyCharacter(characters.Character c) 
    {
        c.setBaseRep(c.getBaseReputation() - 10);
        c.setBaseSway(c.getBaseSway() - 5);
        c.setCHR(c.getCHR() - 1);
        c.setPER(c.getPER() + 4);
    }

    public void revertCharacter(characters.Character c) 
    {
        c.setBaseRep(c.getBaseReputation() + 10);
        c.setBaseSway(c.getBaseSway() + 5);
        c.setCHR(c.getCHR() + 1);
        c.setPER(c.getPER() - 4);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
