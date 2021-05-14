package lambda20200427;
import	java.util.Comparator;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/4/27 11:00<br>
 * 描述:  TODO<br>
 */
public class Program {public static void main(String[] args) {

    // 1. 使用接口实现类的
    Comparator1 comparator = new MyComparator();

    // 2. 使用匿名内部类
    Comparator1 comparator1 = new Comparator1() {
        @Override
        public int compare(int a, int b) {
            return a - b;
        }
    };

    // 3. 使用Lambda表达式来实现接口
    Comparator1 comparator2 = (a, b) -> a - b;
}
}


class MyComparator implements Comparator1 {

    @Override
    public int compare(int a, int b) {
        return a - b;
    }
}


@FunctionalInterface
interface Comparator1 {
    int compare(int a, int b);
}