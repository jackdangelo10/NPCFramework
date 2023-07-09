package settlements;
import civilizations.Civilization;

/**
 * represents the class of settlement with 21-32 structures
 */
public class City extends Settlement
{
    public City(Civilization c)
    {
        super.civilization = c;
        super.settlementSizeName = "City";
        super.MAX_STRUCTURES = 32;
        super.MIN_STRUCTURES = 21;
        System.out.println("Initializing city...");
        
    }

}
