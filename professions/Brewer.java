package professions;

public class Brewer extends Profession
{
    public Brewer()
    {
        setProfName("Brewer");
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
