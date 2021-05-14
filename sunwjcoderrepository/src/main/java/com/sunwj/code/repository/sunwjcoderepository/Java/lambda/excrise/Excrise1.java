package lambda20200427.excrise;
import lambda20200427.data.Person;

import	java.util.ArrayList;
import java.util.List;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/4/27 14:52<br>
 * 描述:  TODO<br>
 */
public class Excrise1 {

    public static void main(String[] args) {
        //排序
        List<Person> list = new ArrayList<Person> ();
        list.add(new Person("xiaoming",10));
        list.add(new Person("xiaolei",9));
        list.add(new Person("jack",15));
        list.add(new Person("mary",12));
        list.add(new Person("aunt Li",30));
        list.add(new Person("sister one",27));

        list.sort((o1, o2) -> o2.age - o1.age);
        System.out.println(list);
    }
}
