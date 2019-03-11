package GPCollege.VIP.GP018084.abstractFactory;

/**
 * Created by ddqqs on 2019/3/11.
 */
public class Test {
    public static void main(String[] args) {
        PearFactory pearFactory = new PearFactory();
        Eat eat = pearFactory.creatEatFactory();
        eat.eatFruits();
    }
}
