package characters;

import characters.CharacterAttributes.Sex;

public class Adam extends Character
{
    private static Adam instance;

    private Adam()
    {
        setName("Adam");
        setSex(Sex.MALE);
    }

    public static Adam getInstance()
    {
        if(instance == null)
        {
            instance = new Adam();
        }
        return instance;
    }
}
