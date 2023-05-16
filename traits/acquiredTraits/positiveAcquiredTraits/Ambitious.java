package traits.acquiredTraits.positiveAcquiredTraits;
import traits.*;

public class Ambitious extends Trait
{

    public Ambitious()
    {
        setChance(15);
        setInheritable(false);
        setTraitName("Ambitious");
        addOpposite("Slothful");
    }

    public void apply(characters.Character c) 
    {
        c.setSTR(c.getSTR() + 1);
        c.setCON(c.getCON() + 1);
        c.setDEX(c.getDEX() + 1);
        c.setINT(c.getINT() + 1);
        c.setPER(c.getPER() + 1);
        c.setCHR(c.getCHR() + 1);
        c.setLCK(c.getLCK() + 1);
        c.setGFT(c.getGFT() + 1);
    }

    public void unapply(characters.Character c) 
    {
        c.setSTR(c.getSTR() - 1);
        c.setCON(c.getCON() - 1);
        c.setDEX(c.getDEX() - 1);
        c.setINT(c.getINT() - 1);
        c.setPER(c.getPER() - 1);
        c.setCHR(c.getCHR() - 1);
        c.setLCK(c.getLCK() - 1);
        c.setGFT(c.getGFT() - 1);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}

