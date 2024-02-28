import java.util.*;

public class LinkedList1{
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ravi");
        ll.add("Ajay");

        for(String x:ll){
            System.out.println(x);
        }
        
    }
}