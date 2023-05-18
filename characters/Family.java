package characters;

import java.util.ArrayList;
import java.util.List;

public class Family 
{
    private List<characters.Character> members;
    private int status = 0;

    public Family() 
    {
        this.members = new ArrayList<>();
    }

    public void addMember(characters.Character person) {
        members.add(person); 
    }


/**GETTERS AND SETTERS ***************************************************************** */

    public List<characters.Character> getMembers() {
        return members;
    }

    public void setMembers(List<characters.Character> members) {
        this.members = members;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

 
}
