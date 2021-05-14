package proxy20200719.proxyjdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/7/19 20:43<br>
 * 描述:  TODO<br>
 */
public class PersonServiceInterceptor implements InvocationHandler {

    //目标类
    private Object target;
    //增强类
    private MyTransaction myTransaction;
    //构造函数注入目标类和增强类
    public PersonServiceInterceptor(Object target,MyTransaction myTransaction){
        this.target = target;
        this.myTransaction = myTransaction;
    }

    /**
     * 注意：在动态代理在生成代理对象的时候需要一个拦截器 InvocationHandler 因此咱们需要写一个拦截器
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.myTransaction.beginTransaction();
        Object returnValue = method.invoke(this.target, args);
        this.myTransaction.commit();
        return returnValue;
    }
}
