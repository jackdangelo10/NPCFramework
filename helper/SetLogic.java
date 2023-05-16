package helper;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;

//https://stackoverflow.com/questions/5283047/intersection-and-union-of-arraylists-in-java

public class SetLogic 
{
    public <T> ArrayList<T> union(ArrayList<T> list1, ArrayList<T> list2) 
    {
        Set<T> set = new HashSet<T>();

        set.addAll(list1);
        set.addAll(list2);

        return new ArrayList<T>(set);
    }

    public <T> ArrayList<T> intersection(ArrayList<T> list1, ArrayList<T> list2) 
    {
        ArrayList<T> list = new ArrayList<T>();

        for (T t : list1) {
            if(list2.contains(t)) {
                list.add(t);
            }
        }

        return list;
    }

    public <T> ArrayList<T> exclusiveOr(ArrayList<T> list1, ArrayList<T> list2)
    {
        ArrayList<T> list3 = list1;
        list1.removeAll(list2);
        list2.remove(list3);
        list1.addAll(list2);
        return list1;
    }
}
