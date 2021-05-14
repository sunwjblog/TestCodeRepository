package singleton20200720;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/7/9 15:40<br>
 * 描述:  双重检测  缺点 指令重排序
 * instance 成员变量加上 volatile 关键字，禁止指令重排序
 */
public class Singleton3_1 {

    private static volatile Singleton3_1 instance;

    private Singleton3_1(){}

    public static Singleton3_1 getInstance(){
        if(instance == null){
            synchronized (Singleton3_1.class){
                if (instance == null) {
                    instance = new Singleton3_1();
                }
            }
        }
        return instance;
    }
}
