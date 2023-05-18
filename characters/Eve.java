package characters;

import characters.CharacterAttributes.Sex;

public class Eve extends Character
{
    private static Eve instance;

    private Eve()
    {
        setName("Eve");
        setSex(Sex.FEMALE);
    }

    public static Eve getInstance()
    {
        if(instance == null)
        {
            instance = new Eve();
        }
        return instance;
    }
}
