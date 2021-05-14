package lambda20200427.functional;

/**
 * 北京千锋互联科技有限公司-好程序员-大数据教学部
 * created by Zhang
 * 千锋大数据学习营：241617568
 * www.mobiletrain.org , www.goodprogrammer.org
 */
public class FunctionalInterface {
    public static void main(String[] args) {
        // 系统内置的一些函数式接口

        // Predicate<T>     :       参数T  返回值boolean
        //      IntPredicate        int -> boolean
        //      LongPredicate       long -> boolean
        //      DoublePredicate     double -> boolean

        // Consumer<T>      :       参数T  返回值void
        //      IntConsumer         int -> void
        //      LongConsumer        long -> void
        //      DoubleConsumer      double -> void

        // Function<T, R>   :       参数T  返回值R
        //      IntFunction<R>      int -> R
        //      LongFunction<R>     long -> R
        //      DoubleFunction<R>   double -> R
        //      IntToLongFunction   int -> long
        //      IntToDoubleFunction int -> double
        //      LongToIntFunction   long -> int
        //      LongToDoubleFunction long -> double
        //      DoubleToIntFunction doublt -> int
        //      DoubleToLongFunction double -> long


        // Supplier<T>      :       参数无  返回值T
        // UnaryOperator<T> :       参数T  返回值T
        // BinaryOperator<T>:       参数T, T  返回值T
        // BiFunction<T, U, R>  :   参数T, U  返回值R
        // BiPredicate<T, U>    :   参数T, U  返回值boolean
        // BiConsumer<T, U>     :   参数T, U  返回值void


        // Predicate<T> 、 Consumer<T>  、 Function<T, R> 、 Supplier<T>


    }
}
