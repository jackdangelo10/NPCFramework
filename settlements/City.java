package settlements;
import civilizations.Civilization;

public class City extends Settlement
{
    public City(Civilization c)
    {
        super.civilization = c;
        super.settlementSizeName = "City";
        super.MAX_POP = 100;
        super.MIN_POP = 65;
        System.out.println("Initializing city...");
        
    }

}
