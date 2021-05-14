package netty20200803.buffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class ByteBufferDemo {

    public static void main(String[] args) {
        //方式1：allocate方式直接分配，内部将隐含的创建一个数组
        //这段代码隐含地从堆空间中分配了一个 byte 型数组作为备份存储器来储存 10 个 byte变量
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        //方式2：通过wrap根据一个已有的数组创建
        //这段代码构造了一个新的缓冲区对象，但数据元素会存在于数组中。
        // 这意味着通过调用put()函数造成的对缓冲区的改动会直接影响这个数组，而且对这个数组的任何改动也会对这个缓冲区对象可见。
        byte[] bytes=new byte[10];
        ByteBuffer wrap = ByteBuffer.wrap(bytes);
        //方式3：通过wrap根据一个已有的数组指定区间创建
        //带有 offset 和 length 作为参数的 wrap()函数版本则会构造一个按照您提供的 offset 和 length 参数值初始化位置和上界的缓冲区。
        //这个函数并不像您可能认为的那样，创建了一个只占用了一个数组子集的缓冲区。这个缓冲区可以存取这个数组的全部范围； offset 和 length 参数只是设置了初始的状态。

        ByteBuffer wrapoffset = ByteBuffer.wrap(bytes,2,5);
        //打印出刚刚创建的缓冲区的相关信息
        print(byteBuffer,wrap,wrapoffset);
    }

    private static void print(Buffer... buffers) {
        for (Buffer buffer : buffers) {
            System.out.println("capacity="+buffer.capacity()
                    +",limit="+buffer.limit()
                    +",position="+buffer.position()
                    +",hasRemaining:"+buffer.hasArray()
                    +",remaining="+buffer.remaining()
                    +",hasArray="+buffer.hasArray()
                    +",isReadOnly="+buffer.isReadOnly()
                    +",arrayOffset="+buffer.arrayOffset());//arrayOffset()，返回缓冲区数据在数组中存储的开始位置的偏移量（从数组头 0 开始计算）。如果您使用了带有三个参数的版本的 wrap()函数来创建一个缓冲区，对于这个缓冲区， arrayOffset()会一直返回 0
        }
    }
}
