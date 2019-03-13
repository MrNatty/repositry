package GPCollege.VIP.GP018084.Proxy;

/**
 * Created by ddqqs on 2019/3/12.
 */
public class Test {
    public static void main(String[] args) {
        JdkProxy jdkProxy = new JdkProxy(new HanMeiMei());
        Star instance = (Star) jdkProxy.getInstance();
        instance.sing();
    }
}
