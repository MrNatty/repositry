package strategy2;

/**
 * Created by ddqqs on 2019/3/17.
 */
public class StrategyTest {
    public static void main(String[] args) {
        StrategyCore strategyCore = new StrategyCore();
        ResultMsg strategy = strategyCore.getStrategy("WeiWeiJiuZhao");
        System.out.println(strategy.getMsg()+strategy.getCode());
    }
}
