package traits.geneticTraits.neutralGeneticTraits;
import traits.*;

public class Inbred extends Trait
{
    public Inbred()
    {
        setChance(0);
        setTraitName("Inbred"); 
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setBaseRep(c.getBaseReputation() - 15);
        c.setINT(c.getINT() - 3);
        c.setCON(c.getCON() - 2);
        c.setGFT(c.getGFT()  + 1);
    }

    public void revertCharacter(characters.Character c)
    {
        c.setBaseRep(c.getBaseReputation() + 15);
        c.setINT(c.getINT() + 3);
        c.setCON(c.getCON() + 2);
        c.setGFT(c.getGFT()  - 1);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
