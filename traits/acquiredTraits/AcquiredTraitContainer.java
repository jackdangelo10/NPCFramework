package traits.acquiredTraits;

import traits.*;
import traits.acquiredTraits.negativeAcquiredTraits.NegativeAcquiredTraitContainer;
import traits.acquiredTraits.neutralAcquiredTraits.NeutralAcquiredTraitContainer;
import traits.acquiredTraits.positiveAcquiredTraits.PositiveAcquiredTraitContainer;

import java.util.ArrayList;

public class AcquiredTraitContainer
{
    private static ArrayList<Trait> acquiredTraits = new ArrayList<Trait>();

    public AcquiredTraitContainer()
    {
        acquiredTraits.clear();
        acquiredTraits.addAll(new PositiveAcquiredTraitContainer().getList());
        acquiredTraits.addAll(new NegativeAcquiredTraitContainer().getList());
        acquiredTraits.addAll(new NeutralAcquiredTraitContainer().getList());
    }

    public ArrayList<Trait> getList()
    {
        return acquiredTraits;
    }  
}
