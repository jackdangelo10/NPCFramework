package governments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GovernmentAttributes 
{
    private static final Random RANDOM = new Random();

    public enum CitizenshipLevel
    {
        CITIZENSHIP, RESIDENCE, SERVITUDE, UNDESIRABLE, TRAVELER, CRIMINAL, MINOR,
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
