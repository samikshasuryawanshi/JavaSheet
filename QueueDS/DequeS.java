import java.util.*;
class DequeS{
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();

        q.addFirst(1);
        q.addFirst(2);
        q.addFirst(3);
        System.out.println(q);

        q.removeFirst();
        System.out.println(q);

        q.addLast(4);
        q.addLast(5);
        System.out.println(q);

        q.removeLast();
        System.out.println(q);

        
        System.out.println(q.getFirst());
        System.out.println(q.getLast());
    }
}