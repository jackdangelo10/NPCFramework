import characters.CharacterAttributes.Sex;
import professions.Profession;
import professions.ProfessionAssignmentScheduler;
import professions.ProfessionGenerator;
import settlements.Settlement;
import settlements.SettlementGenerator;
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

import java.util.ArrayList;
import java.util.List;

import javax.management.BadAttributeValueExpException;

import characters.*;
import characters.Character;

public class TestSuite 
{
     
    public static void main(String[] args) 
    {
        NPCGenerator gen = new NPCGenerator();
        List<characters.Character> npcList = new ArrayList<characters.Character>();
        for(int i = 0; i < 3; i++)
        {
            npcList.add(gen.generateRandomAdultNPC());
        }
        List<Structure> structureList = new ArrayList<>();
        structureList.add(new AssemblyHall());
        structureList.add(new Mine());
        structureList.add(new Farmstead());
        structureList.add(new WinePress());
        structureList.add(new WinePress());
        structureList.add(new WinePress());
        structureList.add(new WinePress());
        structureList.add(new WinePress());
        structureList.add(new WinePress());
        ProfessionAssignmentScheduler scheduler = new ProfessionAssignmentScheduler();
        List<characters.Character> list = scheduler.schedule(npcList, structureList, ProductionTag.BALANCED);
        
        scheduler.printMap();
        System.out.println("unemployed " + list);
    }
}
