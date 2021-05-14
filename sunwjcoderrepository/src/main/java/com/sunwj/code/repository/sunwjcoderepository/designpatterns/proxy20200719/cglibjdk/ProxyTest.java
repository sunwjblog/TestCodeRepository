package proxy20200719.cglibjdk;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/7/19 20:44<br>
 * 描述:  TODO<br>
 */
public class ProxyTest {


    public static void main(String[] args) {
        Object target = new PersonServiceImpl();
        MyTransaction myTransaction = new MyTransaction();
        PersonServiceInterceptor interceptor = new PersonServiceInterceptor(target, myTransaction);
        PersonService personService =(PersonService) interceptor.createProxy();
        String returnValue = (String)personService.savePerson();
        System.out.println(returnValue);
    }
}
