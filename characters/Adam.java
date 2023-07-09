package characters;

import characters.CharacterAttributes.Sex;

/**
 * Singleton class designed to be the top of the family tree,
 * the original "father" entity
 */

public class Adam extends Character
{
    private static Adam instance;

    private Adam()
    {
        setName("Adam");
        setSex(Sex.MALE);
    }

    /**
     * @return global instance of Adam
     */
    public static Adam getInstance()
    {
        if(instance == null)
        {
            instance = new Adam();
        }
        return instance;
    }
}
