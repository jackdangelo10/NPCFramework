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

//a scheduler designed to assign professions to the unemployed and assigned them an associated structure in the settlement
public class ProfessionAssignmentScheduler 
{
    private static Map<String, String> mappings = new HashMap<>();
    private static ProfessionGenerator professionGenerator = new ProfessionGenerator();

    /**
     * @param npcs list of unemployed npcs
     * @param structures list of available structures
     * @param tag - a tag representing the focus of the settlement economy (HAPPINNESS, FOOD, 
     * GOLD, INFLUENCE, MANPOWER, RESEARCH, POLICY, CULTURE, BALANCED;)
     * @return the remaining unemployed characters in a list
     */
    public List<characters.Character> schedule(List<characters.Character> npcs, List<Structure> structures, StructureAttributes.ProductionTag tag)
    {
        Queue<characters.Character> unemployedQueue = new LinkedList<>(npcs);
        List<Structure> availableStructures = new ArrayList<>(structures);

        //sorts structures based on priority
        if(tag == ProductionTag.BALANCED)
        {
            //fix balanced code so that it doesn't fill up entirely
            Collections.shuffle(availableStructures);

            return assignNPCsToStructuresBalanced(unemployedQueue, structures);
        }
        else
        {
            //sort placing structures that match the tag first in the list
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
        if(unemployedQueue.isEmpty())
        {
            return null;
        }
        else
        {
            return new ArrayList<characters.Character>(unemployedQueue);
        }
    }


    /**
     * @param unemployedQueue queue of unemployed characters
     * @param availableStructures list of available structures
     * @return remaining unemployed list
     */
    private List<characters.Character> assignNPCsToStructuresBalanced(Queue<characters.Character> unemployedQueue, List<Structure> availableStructures)
    {
        //so that the distribution of jobs is equal amount all structures
        int jobsPerStructure = (int) Math.ceil((unemployedQueue.size() / availableStructures.size()));
        
        //structures are ranked with a priority 1-10
        if(jobsPerStructure == 0)
        {
            jobsPerStructure++;
            //priority so that crucial buildings don't go unoccupied.
            availableStructures.sort(Comparator.comparingInt(Structure::getPriority).reversed());
        }
        outer:
        for(Structure str: availableStructures)
        {
            int count = 0;
            while(count < jobsPerStructure && !str.isFull())
            {
                if(unemployedQueue.isEmpty())
                {
                    break outer;
                }
                characters.Character c = unemployedQueue.poll();
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
                        count++;
                        break;
                    }
                }
            }
        }
        if(unemployedQueue.isEmpty())
        {
            return null;
        }
        else
        {
            return new ArrayList<characters.Character>(unemployedQueue);
        } 
    }

    public void printMap()
    {
        for(String i : mappings.keySet())
        {
            System.out.println(i + " " + mappings.get(i));
        }
    }
}
