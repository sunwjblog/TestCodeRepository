package lambda20200427.syntax;

import lambda20200427.data.Person;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/4/27 14:41<br>
 * 描述:  TODO<br>
 */
public class Syntax4 {

    public static void main(String[] args) {
        //构造函数的引用
        PersonCreator creator = Person::new;
        Person p = creator.getPersonCreator();

        PersonCreator2 creator2 = Person::new;
        Person p2 = creator2.getPersonCreator("xiaoming",10);

    }
}

interface PersonCreator{
    Person getPersonCreator();
}
interface PersonCreator2{
    Person getPersonCreator(String name,int age);
}

