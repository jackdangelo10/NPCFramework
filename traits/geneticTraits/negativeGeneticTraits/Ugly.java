package traits.geneticTraits.negativeGeneticTraits;
import traits.*;

public class Ugly extends Trait
{

    public Ugly()
    {
        setChance(.15);
        setTraitName("Ugly");
        addOpposite("Gorgeous");
        addOpposite("Attractive");
        addOpposite("Grotesque");
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setCHR(c.getCHR() - 1);
        c.setBaseSway(c.getBaseSway() - 5);
    }

    public void revertCharacter(characters.Character c)
    {
        c.setCHR(c.getCHR() + 1);
        c.setBaseSway(c.getBaseSway() + 5);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
