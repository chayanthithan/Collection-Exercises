import java.util.*;
import java.util.List;


class Question1{
    public static void main(String[] args){
        //Write a Java program to create an array list, add some colors (strings) and print out the collection.
        ArrayList<String> al=new ArrayList<String>(List.of("Red","orange","green","white","black"));
        System.out.println(al);
        // for(String x:al){
        //     System.out.println(x);
        // }
        // Iterator<String> it=al.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

    }
}