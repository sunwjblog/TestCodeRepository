package proxy20200719.cglibjdk;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/7/19 20:43<br>
 * 描述:  TODO<br>
 */
public class PersonServiceInterceptor implements MethodInterceptor {

    //目标类
    private Object target;
    //增强类
    private MyTransaction myTransaction;
    //构造函数注入目标类和增强类
    public PersonServiceInterceptor(Object target, MyTransaction myTransaction){
        this.target = target;
        this.myTransaction = myTransaction;
    }
    public Object createProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this);
        enhancer.setSuperclass(this.target.getClass());
        return enhancer.create();
    }

    @Override
    public Object intercept(Object arg0, Method arg1, Object[] arg2,
                            MethodProxy arg3) throws Throwable {
        myTransaction.beginTransaction();
        Object returnValue = arg1.invoke(this.target, arg2);
        myTransaction.commit();
        return returnValue;
    }
}
