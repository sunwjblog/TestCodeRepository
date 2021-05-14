package proxy20200719.proxyjdk;

import java.lang.reflect.Proxy;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/7/19 20:44<br>
 * 描述:  TODO<br>
 */
public class ProxyTest {

    /**
     * 1、当客户端执行代理对象.方法时，进入到了拦截器的invoke方法体
     *
     * 2、拦截器中invoke方法体的内容就是代理对象方法体的内容
     *
     * 3、拦截器中invoke方法的method参数是在调用的时候赋值的
     * @param args
     */
    public static void main(String[] args) {
        Object target = new PersonServiceImpl();
        MyTransaction myTransaction = new MyTransaction();
        PersonServiceInterceptor interceptor = new PersonServiceInterceptor(target, myTransaction);
        PersonService personService = (PersonService)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),interceptor);
        String returnValue = (String)personService.savePerson();
        System.out.println(returnValue);
    }
}
