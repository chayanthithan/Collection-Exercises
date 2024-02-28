import java.util.*;
public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("cat");
        ll.add("dog");
        ll.add("fox");
        ll.add("elephant");
        ll.add("lion");

        System.out.println("-----------");
        System.out.println(ll);
        ll.add(1,"tiger");
        System.out.println(ll);

        LinkedList<String> ll1=new LinkedList<>();
        ll1.add("cow");
        ll1.add("goat");

        ll.addAll(ll1);
        System.out.println("----------------");
        ll.addFirst("rat");
        ll.addLast("rabbit");
        System.out.println("------------------");
        System.out.println(ll);
        System.out.println("------------------");
        Iterator it=ll.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        

    }
}
