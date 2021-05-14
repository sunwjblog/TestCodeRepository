package lambda20200427.excrise;

import lambda20200427.data.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/4/27 14:52<br>
 * 描述:  TODO<br>
 */
public class Excrise2 {

    public static void main(String[] args) {
        //排序
        Set<Person> list = new TreeSet<Person>( (o1,o2) ->{
            if (o1.age >= o2.age) {
                return -1;
            } else {
                return 1;
            }
        });
        list.add(new Person("xiaoming",10));
        list.add(new Person("xiaolei",9));
        list.add(new Person("jack",15));
        list.add(new Person("mary",12));
        list.add(new Person("aunt Li",30));
        list.add(new Person("sister one",27));
        System.out.println(list);
    }
}
