package professions;
import characters.Character;
import traits.acquiredTraits.negativeAcquiredTraits.Slothful;

public class Hedonist extends Profession
{
    public Hedonist()
    {
        setProfName("Hedonist");
        super.cultureOutput = 3;
        super.foodOutput = -1;
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

    @Override
    public int calculateProfessionSkill(Character c) 
    {
        if(c.isIncapable())
        {
            return 0;
        }
        int skill = c.getCHR() + c.getLCK();
        if(c.getTraits().containsKey("Charming"))
        {
            skill += 25;
        }
        if(c.getTraits().containsKey("Selfish"))
        {
            skill += 5;
        }
        if(c.getTraits().containsKey("Ambitious"))
        {
            skill -= 5;
        }
        return skill;
    }
}
