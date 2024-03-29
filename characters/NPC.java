package characters;

import characters.CharacterAttributes.Mood;

//Non-Player Character with additional stats than character base to influence behavior
public class NPC extends Character
{
    /** CHARACTER INTERACTIONS ******************************************************** */

    private Identity identity = null;

    public NPC()
    {
        identity = new Identity();
    }

    /**
     * calculates opinion of another NPC
     * eventually will be extended to get opinions of player
     * @param c - character to rate
     * @return - NPCs rating 0-100 if NPC c
     */
    public int getOpinion(NPC c)
    {
        int bonus = 0;
        if(identity.getIdl() == c.getIdentity().getIdl())
        {
            bonus += 10;
        }
        for(String i : c.getTraits().keySet())
        {
            if(this.getTraits().containsKey(i))
            {
                bonus += 5;
            }
        }
        if(identity.getMd() == Mood.RESOLVED || identity.getMd() == Mood.OPTIMISTIC 
            || identity.getMd() == Mood.CONTENTED)
        {
            bonus += 5;
        }
        else if(identity.getMd() == Mood.CAUTIOUS || identity.getMd() == Mood.IRRITATED
        || identity.getMd() == Mood.ANGRY)
        {
            bonus -=5;
        }
        if(this.getProfession1() == c.getProfession1())
        {
            bonus += 10;
        }

        if(this.getProfession2() != null && this.getProfession2() == c.getProfession2())
        {
            bonus += 10;
        }
        return bonus;
    }

    /**
     * gets opinion of this NPC on NPC c on whether or not to vote for him
     * @param c - NPC to be rated
     * @return - opinion on electing NPC c 0-100
     */
    public int getVotingOpinion(NPC c)
    {
        int opinion = c.getBaseReputation();
        opinion += getOpinion(c);
        if(this.identity.getIdl() == c.getIdentity().getIdl())
        {
            opinion += 15;
        }
        return  opinion;
    }

    /**
     * calculates this NPC's attraction to NPC c
     * @param c - NPC to be rated
     * @return - attraction rated 0-100
     */
    public int getAttraction(NPC c)
    {
        int attraction = c.getBaseSway();
        attraction += getOpinion(c);
        if(c.getIdentity().getAgreeableness() > 50)
        {
            attraction += 5;
        }
        for(String i : c.getTraits().keySet())
        {
            if(i.equals("Gorgeous"))
            {
                attraction += 15;
            }
            else if(i.equals("Attractive"))
            {
                attraction += 7;
            }
            else if(i.equals("Ugly"))
            {
                attraction -= 7;
            }
            else if(i.equals("Grotesque"))
            {
                attraction -= 17;
            }
        }
        return attraction;
    }
    
//** GETTERS AND SETTERS **********************************************************

    public Identity getIdentity() {
        return identity;
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }
}
