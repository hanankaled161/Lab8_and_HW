public class ArrayQueueTester {
    public static void main(String[] args) {

        ListQueue<Integer> l=new ListQueue<>();
        l.enqueue(1);
        l.enqueue(2);
        ListQueue<Integer> l2=new ListQueue<>();
        l2.enqueue(3);
        l2.enqueue(4);
        l.concat(l2);
        while (!l.isEmpty()) System.out.println(l.dequeue());

/
    }
}
