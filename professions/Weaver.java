package professions;

public class Weaver extends Profession
{
    public Weaver()
    {
        setProfName("Weaver");
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
