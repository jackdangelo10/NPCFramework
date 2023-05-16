package traits.geneticTraits.positiveGeneticTraits;
import traits.*;

public class Giant extends Trait
{

    public Giant()
    {
        setChance(.02);
        setTraitName("Giant");
        addOpposite("Dwarf");
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setSTR(14 + (int)(Math.random() * 5));
        c.setBaseSway(c.getBaseSway() + 10);
    }

    public void revertCharacter(characters.Character c)
    {
        c.setSTR(14 - (int)(Math.random() * 5));
        c.setBaseSway(c.getBaseSway() - 10);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
