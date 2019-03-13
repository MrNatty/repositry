### 静态代理

​	静态代理需要自己创建一个代理类，比较麻烦而且不符合开闭原则

### 动态代理

实现过程（字节码重组）：	1.先获得被代理对象的引用，通过反射获取所有的接口。

​			2.动态生成代理对象,新的类要实现被代理对象的所有接口与方法。

​			3.把本地的InvokeHandle传进去，执行本地的invoke方法。执行代码逻辑。

​			4.生成java代码$Proxy0.class

​			5.jvm加载class文件

```
 private Object target;

    public JdkProxy(Object target){
        this.target=target;
    }
    public Object getInstance(){
        Class<?> targetClass = target.getClass();
    return 
//通过newProxy方法来动态的创建代理类$Proxy0    Proxy.newProxyInstance(targetClass.getClassLoader(),targetClass.getInterfaces(),this);
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
```

### 优缺点

​	优点：使代理类与代理对象实现了分离，一定程度上降低了系统的耦合的。

​		   2.对代理类方法实现了增强

​		3.保护了代理类

缺点：使用代理模式每次都要创建代理类

​	2.增加了系统的复杂度



### 问题

​	jdk动态代理中为何最大的接口长度不能超过65535？

​		因为java类的标准是不允许接口超过65535个

JVM规范中规定的类文件结构中，包含三项用于确定类的继承关系数据：类索引(`this_class`)、父类索引(`super_class`)、接口索引集合(`interfaces`) 其中`this_class`和`super_class`都是一个`u2`类型的数据，而`interfaces`则是一组u2类型的数据集合，他们各自指向一个类型为`CONSTANT_Class_info`的描述符常量，通过该常量的索引值可找到类的全限定名字符串。 对于`interfaces`来说，第一项`u2`为接口计数器`interfaces_count`，表示该类所实现接口的个数，`u2`的大小为2^16-1=65535，所以接口个数不能大于65535。 