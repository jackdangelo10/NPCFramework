package traits.geneticTraits.negativeGeneticTraits;
import traits.*;
public class Dwarf extends Trait
{

    public Dwarf()
    {
        setChance(.02);
        setTraitName("Dwarf");
        addOpposite("Giant");
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setSTR(10 - (int)(Math.random() * 5));
        c.setBaseSway(c.getBaseSway() - 7);
    }

    public void revertCharacter(characters.Character c)
    {
        c.setSTR(10 + (int)(Math.random() * 5));
        c.setBaseSway(c.getBaseSway() + 7);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
