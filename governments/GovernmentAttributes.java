package governments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//possible attributes to be given based on government decisions
public class GovernmentAttributes 
{
    private static final Random RANDOM = new Random();

    //represents a character's citizenship level which determines their rights in 
    //their civilization
    public enum CitizenshipLevel
    {
        CITIZENSHIP, RESIDENCE, TRAVELER, CRIMINAL, MINOR,
        LEADER;

        private static final List<CitizenshipLevel> LEVELS =
        Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = LEVELS.size();

        public static CitizenshipLevel randomCitizenshipLevel()  
        {
            return LEVELS.get(RANDOM.nextInt(SIZE));
        }
    }
}
