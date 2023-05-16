package professions;

public class Judge extends Profession
{
    Judge()
    {
        setProfName("Judge");
    }

    public void modifyCharacter(characters.Character c)
    {
        return;
    }

    public void revertCharacter(characters.Character c)
    {
        return;
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
