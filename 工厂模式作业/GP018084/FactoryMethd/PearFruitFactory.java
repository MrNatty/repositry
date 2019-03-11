package GPCollege.VIP.GP018084.FactoryMethd;

import GPCollege.VIP.GP018084.IFruits;
import GPCollege.VIP.GP018084.PearFruits;

/**
 * Created by ddqqs on 2019/3/11.
 */
public class PearFruitFactory implements FruitsFactory {


    @Override
    public IFruits newstance() {
        return new PearFruits();
    }
}
