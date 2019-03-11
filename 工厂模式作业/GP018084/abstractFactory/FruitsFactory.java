package GPCollege.VIP.GP018084.abstractFactory;

/**
 * Created by ddqqs on 2019/3/11.
 * 给产品族创建工厂接口
 */
public interface FruitsFactory {
    Eat creatEatFactory();

    Sell  creatSellFactory();
}