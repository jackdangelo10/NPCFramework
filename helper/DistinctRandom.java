package helper;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class DistinctRandom 
{
    private List<Integer> list;
    private int size = 0;


    public DistinctRandom()
    {
        list = new ArrayList<Integer>();
    }

    public DistinctRandom(int s)
    {
        size = s;
        for(int i = 0; i < size; i++)
        {
            list.add(i);
        }
        System.out.println(list);
    }

    public void shuffle()
    {
        Collections.shuffle(list);
        System.out.println(list);
    }

    public int getRandom(int index)
    { 
        return list.get(index);
    }

}
