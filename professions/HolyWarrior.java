package professions;

public class HolyWarrior extends Warrior
{
    HolyWarrior()
    {
        setProfName("Holy Warrior");
    }

    public void modifyCharacter(characters.Character c)
    {
        super.modifyCharacter(c);
        c.setBaseReputation(c.getBaseReputation() + 10);
    }

    public void revertCharacter(characters.Character c)
    {
        super.revertCharacter(c);
        c.setBaseReputation(c.getBaseReputation() - 10);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        boolean flag = super.satisfyAllConditions(c);
        if(!c.getTraits().containsKey("Zealous"));
        {
            flag = false;
        }
        return flag;
    }
}
