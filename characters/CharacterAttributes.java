package characters;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * contains attributes to be assigned to characters
 * these will be used during interactions as well as determining how they vote
 * and which factions they might join
 */
public class CharacterAttributes 
{
    private static final Random RANDOM = new Random();

    //represents age of the character
    public enum Age {CHILD, ADULT;}

    //represents sex of the character
    public enum Sex 
    {
        MALE
        {
            public Sex getOpposite()
            {
                return FEMALE;
            }
        },
        
        FEMALE
        {
            public Sex getOpposite()
            {
                return MALE;
            }
        };
        
        public abstract Sex getOpposite();

    }

    //represents political beliefs of character and has an internal function to
    //retrieve a random ideology for assignment/generation
    public enum Ideology 
    {
        HONOR, HUMILITY, MOBILE, STRATIFIED, LIBERTY, ORDER, TOLERANT, TRADITIONAL, SECULAR, PIOUS, APOLITICAL;
        
        private static final List<Ideology> IDEOLOGIES =
        Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = IDEOLOGIES.size();

        public static Ideology randomIdeology()  
        {
            return IDEOLOGIES.get(RANDOM.nextInt(SIZE));
        }
    }

    //represents the current mood of the character, which is randomized each time the player interacts with them
    //(time restrictions apply to avoid spamming/abuse of system)
    //effects dialogue options and receptiveness
    //retrieve a random mood for assignment/generation
    public enum Mood
    {
        AFRAID, RESOLVED, ANGRY, CAUTIOUS, CONTENTED, IRRITATED, MELANCHOLY, RESTLESS,
        OPTIMISTIC, ELATED;

        private static final List<Mood> MOODS =
        Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = MOODS.size();

        public static Mood randomMood()  
        {
            return MOODS.get(RANDOM.nextInt(SIZE));
        }
    }
}
