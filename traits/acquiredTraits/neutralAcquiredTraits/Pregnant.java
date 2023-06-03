package traits.acquiredTraits.neutralAcquiredTraits;

import traits.*;

public class Pregnant extends Trait
{

    public Pregnant()
    {
        setChance(.005);
        setInheritable(false);
        setTraitName("Pregnant");
    }

    public void apply(characters.Character c)
    {
        c.setCON(c.getCON() - 2);
        c.setBaseSway(c.getBaseSway() + 5);
    }

    public void unapply(characters.Character c) 
    {
        c.setCON(c.getCON() + 2);
        c.setBaseSway(c.getBaseSway() - 5);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        if(c.getSex() == characters.CharacterAttributes.Sex.MALE)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}


