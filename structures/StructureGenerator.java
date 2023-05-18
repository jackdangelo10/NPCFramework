package structures;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StructureGenerator 
{
    private List<Structure>  structures = new ArrayList<Structure>();
    private static Random random = new Random();

    public StructureGenerator()
    {
        structures.add(new Bank());
        structures.add(new Barracks());
        structures.add(new Castle());
        structures.add(new Courthouse());
        structures.add(new Dock());
        structures.add(new Farmstead());
        structures.add(new Forge());
        structures.add(new Granary());
        structures.add(new House());
        structures.add(new Library());
        structures.add(new LumberMill());
        structures.add(new Mine());
        structures.add(new Monastery());
        structures.add(new Palace());
        structures.add(new Pasture());
        structures.add(new Quarry());
        structures.add(new Shop());
        structures.add(new Shrine());
        structures.add(new Stables());
        structures.add(new Tavern());
        structures.add(new TownHall());
    }

    public Structure generateRandomStructure()
    {
        if (structures.isEmpty()) 
        {
            return null;
        }
        
        int index = random.nextInt(structures.size());
        return structures.get(index);
    }

    public List<Structure> getList()
    {
        return structures;
    }  

}
