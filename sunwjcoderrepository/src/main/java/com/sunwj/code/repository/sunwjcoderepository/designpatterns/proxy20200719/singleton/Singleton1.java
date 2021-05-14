package singleton20200720;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/7/9 15:32<br>
 * 描述:  饿汉式 线程安全的   缺点不支持延迟加载
 */
public class Singleton1 {
    private static final Singleton1 instance = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return instance;
    }

}
