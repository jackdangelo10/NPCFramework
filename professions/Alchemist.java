package professions;

public class Alchemist extends Profession
{
    public Alchemist()
    {
        setProfName("Alchemist");
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