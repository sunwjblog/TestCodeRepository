package lambda20200427.data;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/4/27 14:40<br>
 * 描述:  TODO<br>
 */
public class Person {

    public String name;
    public int age;

    public Person() {
        System.out.println("无参构造函数执行");
    }

    public Person(String name, int age) {
        System.out.println("有参构造行数执行");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
