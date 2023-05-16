package traits.acquiredTraits.negativeAcquiredTraits;
import traits.*;

public class Deranged extends Trait
{   

    public Deranged()
    {
        setChance(.05);
        setTraitName("Deranged");
    }

    public void modifyCharacter(characters.Character c) 
    {
        c.setPER(c.getPER() - 7);
        c.setCHR(c.getCHR() + 2);
        c.setINT(c.getINT() - 3);
        c.setLCK(c.getLCK() + 3);
        c.setBaseRep(c.getBaseReputation() - 10);
        c.setBaseSway(c.getBaseSway() - 15);
    }

    public void revertCharacter(characters.Character c) 
    {
        c.setPER(c.getPER() + 7);
        c.setCHR(c.getCHR() - 2);
        c.setINT(c.getINT() + 3);
        c.setLCK(c.getLCK() - 3);
        c.setBaseRep(c.getBaseReputation() + 10);
        c.setBaseSway(c.getBaseSway() + 15);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        if(c.getTraitList().contains("Stressed"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}