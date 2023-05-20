import characters.CharacterAttributes.Sex;
import settlements.Settlement;
import settlements.SettlementGenerator;
import structures.Structure;

import java.util.ArrayList;
import java.util.List;

import javax.management.BadAttributeValueExpException;

import characters.*;
import characters.Character;

public class TestSuite 
{
     
    public static void main(String[] args) 
    {
        SettlementGenerator generator = new SettlementGenerator();
        Settlement s = generator.generateRandomSettlement(null);
        System.out.println(s.getSettlementSizeName() + ":");
        for(Structure str : s.getStructures())
        {
            System.out.println(str.getStructureName());
        }
    }
}
