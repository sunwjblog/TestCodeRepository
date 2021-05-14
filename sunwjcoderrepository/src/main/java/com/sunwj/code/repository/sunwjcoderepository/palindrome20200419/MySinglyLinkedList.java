package palindrome20200419;

/**
 * 作者: @author sunwj <br>
 * 时间:  2020/4/19 22:33<br>
 * 描述:  TODO<br>
 */
public class MySinglyLinkedList {

    private  Node head;

    public static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

    /**
     * 按顺序插入链表
     * @param value
     */
    private void insertTail(int value){

        //创建一个新节点
        Node newNode = new Node(value, null);
        //空链表，可以插入新节点作为head，也可以不操作
        if (head == null) {
            head = newNode;
        } else {
            //尾节点追加节点
            Node q = head;
            while(q.next != null){
                q = q.next;
            }
            //在q节点后追加新节点
            newNode.next = q.next;
            q.next = newNode;
        }
    }

    private void printAll(){
        Node p = head;
        while (p != null){
            System.out.print(p.data +" ");
            p = p.next;
        }
        System.out.println();
    }

    private boolean palindrome(){
        if (head == null) {
            return false;
        } else {
            Node p = head;
            Node q = head;
            if (p.next == null){
                System.out.println("只有一个元素");
                return true;
            }
            while (q.next != null && q.next.next != null){
                p = p.next;
                q = q.next.next;
            }
            System.out.println("中间节点" + p.data);
            System.out.println("开始执行奇数节点的回文判断");
            Node leftLink = null;
            Node rightLink = null;
            if (q.next == null) {
                rightLink = p.next;
                leftLink = inverseLinkList(p).next;
                System.out.println("左边第一个节点"+leftLink.data);
                System.out.println("右边第一个节点"+rightLink.data);
            } else {
                rightLink = p.next;
                leftLink = inverseLinkList(p);
            }
            return TFResult(leftLink,rightLink);
        }
    }


    private Node inverseLinkList(Node p){

        Node pre = null;
        Node r = head;
        Node next = null;

        while (r!=p){
            next = r.next;
            r.next = pre;
            pre = r;
            r = next;
        }
        r.next = pre;

        return r;
    }
    private boolean TFResult(Node left,Node right){

        Node l = left;
        Node r = right;
        boolean flag=true;
        System.out.println("left_:"+l.data);
        System.out.println("right_:"+r.data);
        while(l != null && r != null){
            if(l.data == r.data){
                l = l.next;
                r = r.next;
                continue;
            } else {
                flag=false;
                break;
            }
        }
        System.out.println("什么结果");
        return flag;
    }
    // 单链表反转
    public static Node reverse(Node list) {
        Node curr = list, pre = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        MySinglyLinkedList link = new MySinglyLinkedList();
        //int[] test = new int[]{1,2,5,2,1};
        int[] test = new int[]{1,2,3,4,5,6};
        for (int i = 0; i<test.length; i++){
            link.insertTail(test[i]);
        }
        Node linkNode = link.head;
        Node reverseNode =reverse(linkNode);

//        link.printAll();
//        //判断是否为回文
//        if (link.palindrome()) {
//            System.out.println("回文");
//        } else {
//            System.out.println("不是回文");
//        }

    }
}
