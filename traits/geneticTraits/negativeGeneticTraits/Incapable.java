package traits.geneticTraits.negativeGeneticTraits;
import traits.*;

public class Incapable extends Trait
{

    public Incapable()
    {
        setChance(.02);
        setTraitName("Incapable");
        addOpposite("Genius");
        addOpposite("Clever");
        addOpposite("Slow");
    }

    public void apply(characters.Character c)
    {
        c.setINT(7 - (int)(Math.random() * 3));
        c.setCHR(c.getCHR() - 3);
        c.setPER(c.getPER() - 3);
        c.setDEX(c.getDEX() - 2);
        c.setBaseSway(c.getBaseSway() - 15);
        c.setIncapable(true);
    }

    public void unapply(characters.Character c)
    {
        c.setINT(7 + (int)(Math.random() * 3));
        c.setCHR(c.getCHR() + 3);
        c.setPER(c.getPER() + 3);
        c.setDEX(c.getDEX() + 2);
        c.setBaseSway(c.getBaseSway() + 15);
        c.setIncapable(false);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }
}
