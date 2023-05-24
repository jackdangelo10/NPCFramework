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
        for(int i = 0; i < 5; i++)
        {
            npcList.add(gen.generateRandomAdultNPC());
        }
        List<Structure> structureList = new ArrayList<>();
        structureList.add(new Farmstead());
        structureList.add(new Dock());
        structureList.add(new AssemblyHall());
        structureList.add(new Guardhouse());
        structureList.add(new Smithy());
        structureList.add(new Workshop());
        structureList.add(new Mine());
        structureList.add(new AlchemyLabratory());
        ProfessionAssignmentScheduler scheduler = new ProfessionAssignmentScheduler();
        scheduler.schedule(npcList, structureList, ProductionTag.RESEARCH);
        scheduler.printMap();
    }
}
