package GPCollege.VIP.GP018084.FactoryMethd;

import GPCollege.VIP.GP018084.AppleFruit;
import GPCollege.VIP.GP018084.IFruits;

/**
 * Created by ddqqs on 2019/3/11.
 */
public class AppleFruitFactory implements FruitsFactory {

    @Override
    public IFruits newstance() {
        return new AppleFruit();
    }
}
