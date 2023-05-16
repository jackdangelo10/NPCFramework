package professions;
import traits.acquiredTraits.negativeAcquiredTraits.Slothful;

public class Hedonist extends Profession
{
    public Hedonist()
    {
        setProfName("Hedonist");
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setBaseReputation(c.getBaseReputation() - 20);
        c.setCHR(c.getCHR() + 1);
        c.addTrait(new Slothful());
        return;
    }


    public void revertCharacter(characters.Character c)
    {
        c.setBaseReputation(c.getBaseReputation() + 20);
        c.setCHR(c.getCHR() - 1);
        c.removeTrait(new Slothful());
        return;
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
