import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(1);
        al.add(20);
        al.add(5);
        al.add(3);
        al.add(2);
        ListIterator it=al.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("------------------------------");
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
        
    }
}
