package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Frail extends Trait
{

    public Frail()
    {
        setChance(.05);
        setTraitName("Frail");
        addOpposite("Strong");
        addOpposite("Overweight");
    }

    public void modifyCharacter(characters.Character c) 
    {
        c.setCON(c.getCON() - 3);
        c.setDEX(c.getDEX() - 1);
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
