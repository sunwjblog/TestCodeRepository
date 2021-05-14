package lambda20200427.excrise;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/4/27 15:16<br>
 * 描述:  TODO<br>
 */
public class Excrise3 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        // 将集合中的每一个元素都带入到方法accept中。
        // list.forEach(System.out::println);

        // 输出集合中所有的偶数
        list.forEach(ele -> {
            if (ele % 2 == 0) {
                System.out.println(ele);
            }
        });
    }
}
