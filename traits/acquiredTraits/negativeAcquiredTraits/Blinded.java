package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Blinded extends Trait
{

    public Blinded()
    {
        setChance(.02);
        setInheritable(false);
        setTraitName("Blinded");
    }

    public void modifyCharacter(characters.Character c) 
    {
        c.setDEX(c.getDEX() - 4);
        c.setLCK(c.getLCK() + 3);
        c.setGFT(c.getGFT() + 3);
        c.setPER(c.getPER() - 4);
    }

    public void revertCharacter(characters.Character c) 
    {
        c.setDEX(c.getDEX() - 4);
        c.setLCK(c.getLCK() + 3);
        c.setGFT(c.getGFT() + 3);
        c.setPER(c.getPER() - 4);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
