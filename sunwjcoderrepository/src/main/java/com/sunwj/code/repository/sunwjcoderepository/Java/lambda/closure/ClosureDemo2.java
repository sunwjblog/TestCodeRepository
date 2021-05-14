package lambda20200427.closure;

import java.util.function.Consumer;


public class ClosureDemo2 {
    public static void main(String[] args) {

        int a = 10;

        Consumer<Integer> c = ele -> {
            System.out.println(a);
        };


        c.accept(1);



    }
}
