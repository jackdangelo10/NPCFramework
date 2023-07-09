package settlements;
import civilizations.Civilization;

//class of settlement with 5-7 structures
public class Hamlet extends Settlement
{
    public Hamlet(Civilization c)
    {
        super.civilization = c;
        super.settlementSizeName = "Hamlet";
        System.out.println("Initializing hamlet...");
        super.MAX_STRUCTURES = 7;
        super.MIN_STRUCTURES = 5;
    }

}
