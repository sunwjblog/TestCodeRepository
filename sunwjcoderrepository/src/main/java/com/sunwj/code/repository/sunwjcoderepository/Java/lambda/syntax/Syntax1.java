package lambda20200427.syntax;

import lambda20200427.interfaces.*;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/4/27 11:30<br>
 * 描述:  TODO<br>
 */
public class Syntax1 {

    public static void main(String[] args) {
        // 1. Lambda表达式的基础语法:
        // Lambda是一个匿名函数
        // 参数列表 方法体

        // () : 用来描述参数列表
        // {} : 用来描述方法体
        // -> : Lambda运算符，读作goes to

        //1.无参无返回
        LambdaNoneReturnNoneParameter lambda1 = () -> {
            System.out.println("hello world");
        };
        lambda1.test();
        //2.一个参数无返回的
        LambdaNoneReturnSingleParameter lambda2 = (int a) -> {
            System.out.println(a);
        };
        lambda2.test(10);
        //3.多个参数无返回
        LambdaNoneReturnMutipleParameter lambda3 = (int a,int b) -> {
            System.out.println(a+b);
        };
        lambda3.test(10,20);
        //4.无参有返回
        LambdaSingleReturnNoneParameter lambda4 = () -> {
            System.out.println("lambda4");
            return 100;
        };
        int ret = lambda4.test();
        System.out.println(ret);
        //5.单个参数有返回
        LambdaSingleReturnSingleParameter lambda5 = (int a) -> {
            return a;
        };
        int ret1 = lambda5.test(200);
        System.out.println(ret1);
        //6.多个参数有返回
        LambdaSingleReturnMutipleParameter lambda6 = (int a,int b) -> {
            return a+b;
        };
        int ret2 = lambda6.test(1000,999);
        System.out.println(ret2);
    }
}
