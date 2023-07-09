package characters;

//used to go a bit deeper into how NPCs will interact with the player
public class Identity 
{

//These personality stats will be used to decide what decisions an NPC will make
//each pathway of an event will be ranked with the stats and the closest match to the
//character's own stats will be chosen
//if the event choice goes poorly or well, this will reflect and the character's 
//personality stats will be altered accordingly
/** BIG 5 PERSONALITY STATS *************************************************** */
    //tendency to experience negative emotions, how emotionally stable you are
    private int neuroticism = 0;
    //intensity with which people seek new environments
    private int extraversion = 0;
    //tendency to appreciate new ideas, feelings, and experience
    private int openness = 0;
    //how people treat relationships with others, how sensitive they are to 
    //concern for social harmony
    //the needs of others. Also includes how likely to assert your own opinions
    private int agreeableness = 0;
    //ability to regulate impulse control (inhibition, habitual behavior, self-discipline)
    private int conscientiousness = 0;

/** IDEOLOGY AND MOOD **********************************************************/
    private CharacterAttributes.Ideology idl = null;
    private CharacterAttributes.Mood md = null;

/** GETTERS AND SETTERS ******************************************************* */

    public int getNeuroticism() {
        return neuroticism;
    }
    public void setNeuroticism(int neuroticism) {
        this.neuroticism = neuroticism;
    }
    public int getExtraversion() {
        return extraversion;
    }
    public void setExtraversion(int extraversion) {
        this.extraversion = extraversion;
    }
    public int getOpenness() {
        return openness;
    }
    public void setOpenness(int openness) {
        this.openness = openness;
    }
    public int getAgreeableness() {
        return agreeableness;
    }
    public void setAgreeableness(int agreeableness) {
        this.agreeableness = agreeableness;
    }
    public int getConscientiousness() {
        return conscientiousness;
    }
    public void setConscientiousness(int conscientiousness) {
        this.conscientiousness = conscientiousness;
    }
    public CharacterAttributes.Ideology getIdl() {
        return idl;
    }
    public void setIdl(CharacterAttributes.Ideology idl) {
        this.idl = idl;
    }
    public CharacterAttributes.Mood getMd() {
        return md;
    }
    public void setMd(CharacterAttributes.Mood md) {
        this.md = md;
    }
    
}
