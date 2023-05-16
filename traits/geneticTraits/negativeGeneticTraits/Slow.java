package traits.geneticTraits.negativeGeneticTraits;
import traits.*;

public class Slow extends Trait
{

    public Slow()
    {
        setChance(.1);
        setTraitName("Slow");
        addOpposite("Genius");
        addOpposite("Clever");
        addOpposite("Incapable");
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setINT(c.getINT() - 2);
        c.setBaseSway(c.getBaseSway() - 10);
    }

    public void revertCharacter(characters.Character c)
    {
        c.setINT(c.getINT() + 2);
        c.setBaseSway(c.getBaseSway() + 10);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}