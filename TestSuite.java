import settlements.Settlement;
import settlements.SettlementGenerator;
import settlements.SettlementPrinter;

/**
 * Used for unit testing code
 */
public class TestSuite 
{
     
    public static void main(String[] args) 
    {
        SettlementGenerator gen = new SettlementGenerator();
        Settlement s = gen.generateRandomSettlement(null);
        SettlementPrinter printer = new SettlementPrinter();
        printer.printSettlement(s);
    }
}
