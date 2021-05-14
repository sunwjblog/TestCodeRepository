package proxy20200719.proxyjdk;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/7/19 20:42<br>
 * 描述:  TODO<br>
 */
public class MyTransaction {

    public void beginTransaction(){
        System.out.println("开启事务 ");
    }
    public void commit(){
        System.out.println("提交事务");
    }

}
