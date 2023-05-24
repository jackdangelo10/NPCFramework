package professions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import characters.Character;
import structures.Structure;

public class ProfessionAssignmentScheduler 
{
    private static Map<characters.Character, Structure> mappings = new HashMap<>();

    public void schedule(List<characters.Character> npcs, List<Structure> structures)
    {
        Queue<characters.Character> unemployedQueue = new LinkedList<>(npcs);
        List<Structure> availableStructures = new ArrayList<>(structures);

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
                        mappings.put(c, str);
                        c.setAssignedStructure(str);
                        str.getAssignedNPCs().add(c);
                        System.out.println(profession);
                        Profession p = ProfessionGenerator.getProfessionMap().get(profession);
                        c.setProfession1(p);
                        int skill = p.calculateProfessionSkill(c);
                        c.setProfession1Skill(skill);

                        break outer;
                    }
                }
            }   
        }
    }

    public void printMapping()
    {
        for(characters.Character i : mappings.keySet())
        {
            System.out.print(i.getName() + " " + i.getProfession1().getProfName() + " " + i.getAssignedStructure().getStructureName());
        }
    }
}
