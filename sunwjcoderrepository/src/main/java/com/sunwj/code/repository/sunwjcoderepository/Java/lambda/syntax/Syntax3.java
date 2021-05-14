package lambda20200427.syntax;

import lambda20200427.interfaces.LambdaSingleReturnSingleParameter;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/4/27 12:26<br>
 * 描述:  TODO<br>
 */
public class Syntax3 {

    public static void main(String[] args) {
        // 方法引用:
        // 可以快速的将一个Lambda表达式的实现指向一个已经实现的方法。
        // 语法: 方法的隶属者::方法名

        // 注意:
        // 1. 参数数量和类型一定要和接口中定义的方法一致
        // 2. 返回值的类型一定要和接口中定义的方法一致
        LambdaSingleReturnSingleParameter lambda1 = a -> change(a);
        int ret = lambda1.test(10);
        System.out.println(ret);
        // 方法引用：引用了change方法的实现。
        LambdaSingleReturnSingleParameter lambda2 = Syntax3::change;
        int ret2 = lambda1.test(20);
        System.out.println(ret2);
    }
    private static int change(int a){
        return a*2;
    }
}
