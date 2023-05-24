package professions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import characters.Character;
import structures.Structure;
import structures.StructureAttributes;
import structures.StructureAttributes.ProductionTag;

public class ProfessionAssignmentScheduler 
{
    private static Map<String, String> mappings = new HashMap<>();
    private static ProfessionGenerator professionGenerator = new ProfessionGenerator();

    public List<characters.Character> schedule(List<characters.Character> npcs, List<Structure> structures, StructureAttributes.ProductionTag tag)
    {
        Queue<characters.Character> unemployedQueue = new LinkedList<>(npcs);
        List<Structure> availableStructures = new ArrayList<>(structures);

        //sorts structures based on priority
        if(tag == ProductionTag.BALANCED)
        {
            //fix balanced code so that it doesn't fill up entirely
            Collections.shuffle(availableStructures);
            assignNPCsToStructuresBalanced(npcs, structures);
        }
        else
        {
            availableStructures.sort(Comparator.comparingInt(structure -> structure.getProductionTag() == tag ? 0 : 1));
        }

        while(!unemployedQueue.isEmpty() && !availableStructures.isEmpty())
        {
            characters.Character c = unemployedQueue.poll();

            outer:
            for(Structure str : availableStructures)
            {
                if(str.isFull())
                {
                    continue;
                }
                for(String profession : str.getAssociatedProfessions().keySet())
                {

                    if(str.hasVacancy(profession))
                    {
                        mappings.put(c.getName(), profession + " " + str.getStructureName());
                        c.setAssignedStructure(str);
                        str.getAssignedNPCs().add(c);
                        Profession p = professionGenerator.getProfessionMap().get(profession);
                        c.setProfession1(p);
                        int skill = p.calculateProfessionSkill(c);
                        c.setProfession1Skill(skill);

                        break outer;
                    }
                }
            }   
        }
        //remaining unemployed people returned to settlement
        return new ArrayList<characters.Character>(unemployedQueue);
    }


    private void assignNPCsToStructuresBalanced(List<characters.Character> npcs, List<Structure> structures)
    {
        int totalJobs = 0;
        for(Structure str : structures)
        {
            totalJobs += str.getTotalCapacity();
        }
        int jobsPerStructure = totalJobs / structures.size();
        int remainingJobs = totalJobs % structures.size();

        ///FIX LATER
    }

    public void printMap()
    {
        for(String i : mappings.keySet())
        {
            System.out.println(i + " " + mappings.get(i));
        }
    }
}
