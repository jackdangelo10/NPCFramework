package traits.geneticTraits.positiveGeneticTraits;
import traits.*;

public class Attractive extends Trait
{
    public Attractive()
    {
        setChance(.15);
        setTraitName("Attractive");
        addOpposite("Ugly");
        addOpposite("Grotesque");
        addOpposite("Gorgeous");
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setCHR(c.getCHR() + 1);
        c.setBaseSway(c.getBaseSway() + 5);
    }

    public void revertCharacter(characters.Character c)
    {
        c.setCHR(c.getCHR() - 1);
        c.setBaseSway(c.getBaseSway() - 5);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}

