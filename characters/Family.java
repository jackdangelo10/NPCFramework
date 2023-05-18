package characters;

import java.util.ArrayList;
import java.util.List;

public class Family 
{
    private List<characters.Character> members;
    private int familyInfluence = 0;

    public Family() 
    {
        this.members = new ArrayList<>();
    }

    public void addMember(characters.Character person) {
        members.add(person); 
    }


/**GETTERS AND SETTERS ***************************************************************** */
    public List<characters.Character> getAllMembers() {
        return members;
    }

    public List<characters.Character> getMembers() {
        return members;
    }

    public void setMembers(List<characters.Character> members) {
        this.members = members;
    }

    public int getFamilyInfluence() {
        return familyInfluence;
    }

    public void setFamilyInfluence(int familyInfluence) {
        this.familyInfluence = familyInfluence;
    }
 
}
