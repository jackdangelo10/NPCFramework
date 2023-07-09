package characters;

import characters.CharacterAttributes.Sex;

/**
 * Singleton class designed to be the top of the family tree,
 * the original "mother" entity
 */

public class Eve extends Character
{
    private static Eve instance;

    private Eve()
    {
        setName("Eve");
        setSex(Sex.FEMALE);
    }

    /**
     * @return global instance of Eve
     */
    public static Eve getInstance()
    {
        if(instance == null)
        {
            instance = new Eve();
        }
        return instance;
    }
}
