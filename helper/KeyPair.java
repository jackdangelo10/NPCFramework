package helper;

public class KeyPair<T1,T2>
{
    private T1 key; 
    private T2 map;

    public KeyPair(T1 k, T2 m)
    {
        key = k;
        map = m;
    }

    public T1 getKey()
    {
        return key;
    }

    public T2 getMap()
    {
        return map;
    }

    public void setKey(T1 key) {
        this.key = key;
    }

    public void setMap(T2 map) {
        this.map = map;
    }

    
}
