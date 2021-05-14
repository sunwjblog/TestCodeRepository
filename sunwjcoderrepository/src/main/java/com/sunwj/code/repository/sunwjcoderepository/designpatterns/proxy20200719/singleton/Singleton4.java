package singleton20200720;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/7/9 15:44<br>
 * 描述:  静态内部类
 *
 * InnerSingleton4 是一个静态内部类，当外部类 Singleton4 被加载的时候，并不会创建
 * InnerSingleton4 实例对象。只有当调用 getInstance() 方法时，InnerSingleton4 才会
 * 被加载，这个时候才会创建 instance。insance 的唯一性、创建过程的线程安全性，都由
 * JVM 来保证。
 */
public class Singleton4 {

    private Singleton4(){}

    private static class InnerSingleton4{
        private static final Singleton4 instance = new Singleton4();
    }
    public static Singleton4 getInstance(){
        return InnerSingleton4.instance;
    }
}
