package traits.acquiredTraits.neutralAcquiredTraits;
import characters.Attributes.Sex;
import traits.*;

public class Pregnant extends Trait
{

    public Pregnant()
    {
        setChance(.05);
        setInheritable(false);
        setTraitName("Pregnant");
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setCON(c.getCON() - 2);
        c.setMonthsAlong(0);
        c.setBaseSway(c.getBaseSway() + 5);
    }

    public void revertCharacter(characters.Character c) 
    {
        c.setCON(c.getCON() + 2);
        c.setMonthsAlong(0);
        c.setBaseSway(c.getBaseSway() - 5);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        if(c.getSex() == Sex.MALE)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}


