package traits.geneticTraits.positiveGeneticTraits;
import traits.Trait;

public class Genius extends Trait
{
    public Genius()
    {
        setChance(.02); 
        setTraitName("Genius");
        addOpposite("Slow");
        addOpposite("Incapable");
        addOpposite("Clever");
    }

    public void apply(characters.Character c)
    {
        c.setINT(c.getINT() + 4);
        c.setCHR(c.getCHR() - 1);
        c.setBaseSway(c.getBaseSway() + 10);
    }

    public void unapply(characters.Character c)
    {
        c.setINT(c.getINT() - 4);
        c.setCHR(c.getCHR() + 1);
        c.setBaseSway(c.getBaseSway() - 10);
    }

    public boolean meetsRequirements(characters.Character c)
    {
        return true;
    }

}
