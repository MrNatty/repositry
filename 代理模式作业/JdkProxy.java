package GPCollege.VIP.GP018084.Proxy;

import jdk.nashorn.internal.scripts.JD;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by ddqqs on 2019/3/12.
 */
public class JdkProxy implements InvocationHandler {

    private Object target;

    public JdkProxy(Object target){
        this.target=target;
    }
    public Object getInstance(){
        Class<?> targetClass = target.getClass();
    return     Proxy.newProxyInstance(targetClass.getClassLoader(),targetClass.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(this.target,args);
        later();
        return invoke;
    }
    void before(){
        System.out.println("找场地，准备举办演唱会");
    }
    void later(){
        System.out.println("拿钱，交税，走人");
    }
}
