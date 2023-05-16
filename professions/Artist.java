package professions;

public class Artist extends Profession
{
    public Artist()
    {
        setProfName("Artist");
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
        boolean flag = true;
        if(c.getGFT() < 10)
        {
            flag = false;
        } 
        return flag;
    }
}
