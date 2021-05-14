package singleton20200720;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/7/9 15:47<br>
 * 描述:  枚举
 *
 * 基于枚举类型的单例实现。这种实现方式通过
 * Java 枚举类型本身的特性，保证了实例创建的线程安全性和实例的唯一性
 */
public class Singleton5 {

    private enum Singleton{
        INSTENCE;
        private  Singleton5 singleton;
        Singleton(){
            singleton = new Singleton5();
        }
        public Singleton5 getInstance() {
            return singleton;
        }
    }

    private Singleton5(){}

    public static Singleton5 getInstance(){
        return  Singleton.INSTENCE.getInstance();
    }
}
