package settlements;
import civilizations.Civilization;

public class Hamlet extends Settlement
{
    //population is 7 - 20
    public Hamlet(Civilization c)
    {
        super.civilization = c;
        super.settlementSizeName = "Hamlet";
        System.out.println("Initializing hamlet...");
        super.MAX_STRUCTURES = 7;
        super.MIN_STRUCTURES = 5;
    }

}
