package lambda20200427.excrise;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/4/27 15:33<br>
 * 描述:  TODO<br>
 */
public class Excrise5 {

    public static void main(String[] args) {
        // 需求：开辟一条线程。做一个数字的输出

        Thread t = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        });

        t.start();


    }
}
