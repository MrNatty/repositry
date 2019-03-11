package GPCollege.VIP.GP018084.FactoryMethd;

import GPCollege.VIP.GP018084.IFruits;

/**
 * Created by ddqqs on 2019/3/11.
 */
public class MtheodFactoryTest extends PearFruitFactory {
    public static void main(String[] args) {
        AppleFruitFactory appleFruitFactory = new AppleFruitFactory();
        IFruits newstance = appleFruitFactory.newstance();
        newstance.eat();
    }
}
