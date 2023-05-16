package traits.acquiredTraits.positiveAcquiredTraits;

import java.util.ArrayList;

import traits.Trait;

public class PositiveAcquiredTraitContainer 
{
    private static ArrayList<Trait> positiveTraits = new ArrayList<Trait>();

    public PositiveAcquiredTraitContainer()
    {
        positiveTraits.clear();
        positiveTraits.add(new Brave()); //0
        positiveTraits.add(new Charming()); //1
        positiveTraits.add(new Compassionate()); //2
        positiveTraits.add(new Cultured()); //3
        positiveTraits.add(new Disciplined()); //4
        positiveTraits.add(new Inventive()); //5
        positiveTraits.add(new Ambitious()); //6
        positiveTraits.add(new Just()); //7
        positiveTraits.add(new Proud()); //8
        positiveTraits.add(new Prolific()); //9
        positiveTraits.add(new Zealous()); //10
        positiveTraits.add(new Prophet()); //11
        positiveTraits.add(new Merciful()); //12
        positiveTraits.add(new Generous()); //13
        positiveTraits.add(new Humble()); //14
        positiveTraits.add(new Honest()); //15
    }

    public ArrayList<Trait> getList()
    {
        return positiveTraits;
    }   
}
