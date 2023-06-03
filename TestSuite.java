import characters.CharacterAttributes.Sex;
import professions.Profession;
import professions.ProfessionAssignmentScheduler;
import professions.ProfessionGenerator;
import settlements.Settlement;
import settlements.SettlementGenerator;
import settlements.SettlementPrinter;
import structures.AlchemyLabratory;
import structures.AssemblyHall;
import structures.Castle;
import structures.Dock;
import structures.Farmstead;
import structures.Guardhouse;
import structures.Mine;
import structures.Smithy;
import structures.Structure;
import structures.WinePress;
import structures.Workshop;
import structures.StructureAttributes.ProductionTag;
import traits.acquiredTraits.neutralAcquiredTraits.Pregnant;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.management.BadAttributeValueExpException;

import characters.*;
import characters.Character;

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
