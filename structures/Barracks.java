package structures;
import java.util.ArrayList;
import java.util.List;
import civilizations.Civilization;
import settlements.Settlement;

public class Barracks extends Structure
{
    List<Character> stationedGuards = new ArrayList<Character>();

    public Barracks(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        super.structureName = "Barracks";
        super.incomeFood = -1;
        super.incomeGold = -1;
        super.incomeManpower = 4;
    }

    public void addGuard(Character c)
    {
        stationedGuards.add(c);
    }
}
