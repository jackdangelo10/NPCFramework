package settlements;

import characters.Character;
import characters.CharacterPrinter;
import characters.Family;
import characters.CharacterAttributes.Age;
import economies.SettlementEconomyPrinter;
import structures.Structure;

public class SettlementPrinter 
{
    CharacterPrinter characterPrinter = new CharacterPrinter();
    SettlementEconomyPrinter settlementEconomyPrinter = new SettlementEconomyPrinter();

    public void printSettlement(Settlement s)
    {
        System.out.println("Entering settlement printer....");
        System.out.println(s.getSettlementName() + " " + s.getSettlementSizeName());
        System.out.println();


        System.out.println("Family List: ");
        System.out.println();
        for(Family f : s.getFamilies())
        {
            System.out.println("Family Name: " + f.getFamilyName());
            System.out.println();
            for(Character c : f.getMembers())
            {
                characterPrinter.printCharacter(c);
            }
            System.out.println("----------------------------------------------------");
        }

        System.out.println("Unemployed List: ");
        System.out.println();
        if(s.getUnemployed() != null)
        {
            for(Character c : s.getUnemployed())
            {
                System.out.print(c.getName());
                if(c.getAge() == Age.CHILD)
                {
                    System.out.println(" is child");
                }
                else
                {
                    System.out.println();
                }
            }
        }
        else
        {
            System.out.println("No unemployed");
        }
        
        System.out.println("----------------------------------------------------");

        System.out.println("Unhoused List: ");
        System.out.println();
        if(s.getUnhoused() != null)
        {
            for(Character c : s.getUnhoused())
            {
                System.out.println(c.getName());
            }
        }
        else
        {
            System.out.println("No unhoused");
        }
        
        System.out.println("----------------------------------------------------");


        System.out.println("Settlement Economy: ");
        System.out.println();

        settlementEconomyPrinter.printEconomy(s.getEconomy());
        System.out.println("----------------------------------------------------");

        System.out.println("All structures: ");
        System.out.println();
        for(Structure str : s.getStructures())
        {
            System.out.println(str.getStructureName());
        }

        System.out.println("----------------------------------------------------");

        System.out.println("Total population: " + s.getInhabitants().size());

        System.out.println("----------------------------------------------------");


    }
}
