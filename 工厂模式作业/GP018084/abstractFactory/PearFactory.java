package GPCollege.VIP.GP018084.abstractFactory;

/**
 * Created by ddqqs on 2019/3/11.
 * 创建pear的产品族工厂
 */
public class PearFactory implements FruitsFactory {
    @Override
    public Eat creatEatFactory() {
        return new PearEat();
    }

    @Override
    public Sell creatSellFactory() {
        return new PearSell();
    }
}
