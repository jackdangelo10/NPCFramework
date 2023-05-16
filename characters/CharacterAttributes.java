package characters;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CharacterAttributes 
{
    private static final Random RANDOM = new Random();

    public enum Age {CHILD, ADULT;}

    public enum Sex {MALE, FEMALE;}

    public enum Ideology 
    {
        HONOR, HUMILITY, MOBILE, STRATIFIED, LIBERTY, ORDER, TOLERANT, TRADITIONAL, SECULAR, PIOUS;
        
        private static final List<Ideology> IDEOLOGIES =
        Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = IDEOLOGIES.size();

        public static Ideology randomIdeology()  
        {
            return IDEOLOGIES.get(RANDOM.nextInt(SIZE));
        }
    }

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
