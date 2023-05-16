package traits.geneticTraits.neutralGeneticTraits;
import traits.*;

public class Inbred extends Trait
{
    public Inbred()
    {
        setChance(0);
        setTraitName("Inbred"); 
    }

    public void apply(characters.Character c)
    {
        c.setBaseReputation(c.getBaseReputation() - 15);
        c.setINT(c.getINT() - 3);
        c.setCON(c.getCON() - 2);
        c.setGFT(c.getGFT()  + 1);
    }

    public void unapply(characters.Character c)
    {
        c.setBaseReputation(c.getBaseReputation() + 15);
        c.setINT(c.getINT() + 3);
        c.setCON(c.getCON() + 2);
        c.setGFT(c.getGFT()  - 1);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
