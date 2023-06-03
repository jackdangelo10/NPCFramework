package economies;

import resources.Resource;

public class SettlementEconomyPrinter extends EconomyPrinter
{
    public void printEconomy(SettlementEconomy e)
    {
        super.printEconomy(e);
        System.out.println();
        System.out.println("Resource List: " );
        for(Resource r : e.getResources())
        {
            System.out.print(r.getResourceName() + " " + r.getQuantity());
            if(!e.isResourceWorked(r))
            {
                System.out.println(" unworked");
            }
            else
            {
                System.out.println(" " + e.getResourceStructures().get(r).getStructureName());
            }
        }
    }
}
