package GPCollege.VIP.GP018084.PrototypePattern.SimpleClone;

import java.util.Date;

/**
 * Created by ddqqs on 2019/3/11.
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        //浅克隆
        UserVo userVo = new UserVo();
        userVo.adderss="北京";
        userVo.age=18;
        userVo.brith=new Date();
        userVo.name="MrNatty";
        userVo.sex="男";
        /**
         * 优化之前
         * User user = new User();
         user.adderss=userVo.adderss;
         user.age=userVo.age;
         user.brith=userVo.brith;
         user.name = userVo.name;
         */
        //优化后
        User clone = userVo.clone();
        System.out.println(clone.toString());
    }
}
