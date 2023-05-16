package professions;

public class Guard extends Warrior
{
    Guard()
    {
        setProfName("Guard");
    }

    public void modifyCharacter(characters.Character c)
    {
        super.modifyCharacter(c);
    }

    public void revertCharacter(characters.Character c)
    {
        super.revertCharacter(c);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return super.satisfyAllConditions(c);
    }
}
