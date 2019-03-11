package GPCollege.VIP.GP018084.SimpleFactory;


import GPCollege.VIP.GP018084.IFruits;

/**
 * Created by ddqqs on 2019/3/11.
 */
public class FactoryTest {
    public static void main(String[] args) {
        FruitsFactory fruitsFactory = new FruitsFactory();
        IFruits apple = fruitsFactory.newstance("apple");
        apple.eat();
    }
}
