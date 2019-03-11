package GPCollege.VIP.GP018084.abstractFactory;

/**
 * Created by ddqqs on 2019/3/11.
 * 创建apple的产品族工厂
 */
public class AppleFactory implements FruitsFactory {
    @Override
    public Eat creatEatFactory() {
        return new AppleEat();
    }

    @Override
    public Sell creatSellFactory() {
        return new PearSell();
    }
}
