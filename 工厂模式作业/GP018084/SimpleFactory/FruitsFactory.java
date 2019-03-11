package GPCollege.VIP.GP018084.SimpleFactory;

import GPCollege.VIP.GP018084.AppleFruit;
import GPCollege.VIP.GP018084.IFruits;
import GPCollege.VIP.GP018084.PearFruits;

/**
 * Created by ddqqs on 2019/3/11.
 */
public class FruitsFactory {

    public IFruits newstance(String name){
        IFruits fruits;
        if("apple".equals(name)) {
            fruits = new AppleFruit();
        }else if("pear".equals(name)){
            fruits = new PearFruits();
        }else {
            return null;
        }
            return fruits;
    }
}
