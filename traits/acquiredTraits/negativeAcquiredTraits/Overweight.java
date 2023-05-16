package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Overweight extends Trait
{

    public Overweight()
    {
        setChance(.05);
        setInheritable(false);
        setTraitName("Overweight");
        addOpposite("Frail");
    }

    public void modifyCharacter(characters.Character c) 
    {
        c.setCON(c.getCON() - 3);
        c.setCHR(c.getCHR() - 1);
        c.setHealth(c.getHealth() - 10);
    }

    public void revertCharacter(characters.Character c) 
    {
        c.setCON(c.getCON() + 3);
        c.setCHR(c.getCHR() + 1);
        c.setHealth(c.getHealth() + 10);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
