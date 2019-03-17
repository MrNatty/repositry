package strategy2;



import org.apache.cxf.common.util.StringUtils;

import java.util.HashMap;

/**
 * Created by ddqqs on 2019/3/17.
 */
public class StrategyCore {
    private final static String STRATEGY_1 = "WeiWeiJiuZhao";
    private final static String STRATEGY_2 = "JieDaoShaRen";
    private final static String STRATEGY_3 = "AnDuChengCang";
    private HashMap<String,Strategy> strategyHashMap = new HashMap<>();
    public StrategyCore(){
        strategyHashMap.put(STRATEGY_1,new WeiweijiuzhaoStrategy());
        strategyHashMap.put(STRATEGY_2,new JiedaosharenStrategy());
        strategyHashMap.put(STRATEGY_3,new AnduchencangStrategy());
    }

    public ResultMsg getStrategy(String strategy){
        ResultMsg resultMsg = new ResultMsg();
        if (strategyHashMap.get(strategy)==null){
            resultMsg.setMsg("传入参数无法解析");
            resultMsg.setCode("250");
        }else {
            Strategy strategy1 = strategyHashMap.get(strategy);
            strategy1.strategy();
            resultMsg.setMsg("计策生成");
            resultMsg.setCode("200");
        }
    return resultMsg;
    }
}

