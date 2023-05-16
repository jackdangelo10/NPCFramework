package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Craven extends Trait
{

    public Craven()
    {
        setChance(.15);
        setInheritable(false);
        setTraitName("Craven");
        addOpposite("Brave");
        addOpposite("Proud");
    }

    public void modifyCharacter(characters.Character c) 
    {
        c.setBaseSway(c.getBaseSway() - 5);
        c.setCHR(c.getCHR() - 1);
    }

    public void revertCharacter(characters.Character c) 
    {
        c.setBaseSway(c.getBaseSway() + 5);
        c.setCHR(c.getCHR() + 1);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
