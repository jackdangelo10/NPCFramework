package professions;

public class Stablehand extends Profession
{
    public Stablehand()
    {
        setProfName("Stablehand");
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
