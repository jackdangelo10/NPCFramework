package professions;

public class Barkeeper extends Profession 
{
    public Barkeeper()
    {
        setProfName("Barkeeper");
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
