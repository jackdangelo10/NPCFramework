package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Depressed extends Trait
{

    public Depressed()
    {
        setChance(.05);
        setInheritable(false);
        setTraitName("Depressed");
    }

    public void modifyCharacter(characters.Character c) 
    {
        c.setSTR(c.getSTR() - 1);
        c.setCON(c.getCON() - 1);
        c.setDEX(c.getDEX() - 1);
        c.setINT(c.getINT() - 1);
        c.setPER(c.getPER() - 1);
        c.setCHR(c.getCHR() - 1);
        c.setLCK(c.getLCK() - 1);
        c.setGFT(c.getGFT() - 1);
        c.setHealth(c.getHealth() - 5);
    }

    public void revertCharacter(characters.Character c) 
    {
        c.setSTR(c.getSTR() + 1);
        c.setCON(c.getCON() + 1);
        c.setDEX(c.getDEX() + 1);
        c.setINT(c.getINT() + 1);
        c.setPER(c.getPER() + 1);
        c.setCHR(c.getCHR() + 1);
        c.setLCK(c.getLCK() + 1);
        c.setGFT(c.getGFT() + 1);
        c.setHealth(c.getHealth() + 5);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
