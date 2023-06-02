package resources;

public abstract class Resource implements Cloneable
{
    protected String resourceName;
    protected int quantity;
    protected String associatedStructure = null;

    @Override
    public Resource clone() 
    {
        try 
        {
            return (Resource) super.clone();
        } catch (CloneNotSupportedException e) 
        {
            // Handle the exception if necessary
            return null;
        }
    }
}
