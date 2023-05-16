package professions;

public class Blacksmith extends Profession
{
    Blacksmith()
    {
        setProfName("Blacksmith");
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
