package singleton20200720;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/7/9 15:36<br>
 * 描述:  懒汉式  支持延迟加载  但高并发下性能差
 */
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2(){}

    public static synchronized Singleton2 getInstance(){
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
