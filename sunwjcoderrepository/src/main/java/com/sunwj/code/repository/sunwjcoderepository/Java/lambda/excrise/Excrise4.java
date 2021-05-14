package lambda20200427.excrise;
import	java.util.Iterator;
import	java.util.ArrayList;

import lambda20200427.data.Person;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/4/27 14:52<br>
 * 描述:  TODO<br>
 */
public class Excrise4 {

    public static void main(String[] args) {
        //排序
        List<Person> list = new ArrayList<Person> ();
        list.add(new Person("xiaoming",10));
        list.add(new Person("xiaolei",9));
        list.add(new Person("jack",15));
        list.add(new Person("mary",12));
        list.add(new Person("aunt Li",30));
        list.add(new Person("sister one",27));

        /*Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()){
            Person p = iterator.next();
            if(p.age>10){
                iterator.remove();
            }
        }*/
        //lambda表达式实现
        list.removeIf(ele -> ele.age>10);
        System.out.println(list);
    }
}
