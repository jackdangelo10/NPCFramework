package professions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import characters.Character;
import structures.Structure;
import structures.StructureGenerator;

public class ProfessionAssignmentScheduler 
{

    public static void schedule(List<Character> npcs, List<Structure> structures)
    {
        Queue<Character> unemployedQueue = new LinkedList<>(npcs);
        List<Structure> availableStructures = new ArrayList<>(structures);

        while(!unemployedQueue.isEmpty() && !availableStructures.isEmpty())
        {
            Character c = unemployedQueue.poll();

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
                        c.setAssignedStructure(str);
                        str.getAssignedNPCs().add(c);
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
}
