package lambda20200427.syntax;

import lambda20200427.interfaces.*;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/4/27 12:20<br>
 * 描述:  TODO<br>
 */
public class Syntax2 {

    public static void main(String[] args) {
        // 语法精简：
        // 1. 参数类型:
        // 由于在接口的抽象方法中，已经定义了参数的数量和类型。所以在Lambda表达式中，参数的类型可以省略。
        // 备注: 如果需要省略类型，则每一个参数的类型都要省略。千万不要出现省略一个参数类型，不省略一个参数类型
        LambdaNoneReturnMutipleParameter lambda1 = (a,b) -> {
            System.out.println("hello world");
        };
        // 2. 参数小括号:
        // 如果参数列表中，参数的数量只有一个。此时小括号可以省略
        LambdaNoneReturnSingleParameter lambda2 = a -> {
            System.out.println("只有一个参数");
        };
        // 3. 方法大括号:
        // 如果方法体中只有一条语句，此时大括号可以省略
        LambdaNoneReturnSingleParameter lambda3 = a -> System.out.println("单条语句");
        // 4. 如果方法体中唯一的一条语句是一个返回语句，则在省略掉大括号的同时，也必须省略掉return。
        LambdaSingleReturnNoneParameter lambda4 = () -> 10;
        //5
        LambdaSingleReturnMutipleParameter lambda5 = (a,b) -> a+b;

    }
}
