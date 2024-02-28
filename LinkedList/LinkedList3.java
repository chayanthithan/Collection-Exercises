import java.util.*;
public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>(List.of(1,4,20,10,20,30));
        System.out.println(ll);
        System.out.println("-----------------");
        Iterator it=ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("---------------");
        Iterator it1=ll.descendingIterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }
}
