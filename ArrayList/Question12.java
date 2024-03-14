import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question12 {
    public static void main(String[] args) {
        //Write a Java program to extract a portion of an array list.
        ArrayList<Integer> al=new ArrayList<>(List.of(1,2,3,4,5,6));
        ArrayList<Character> al2=new ArrayList<>(List.of('d','e','a','b','c'));
        
        // System.out.println(al2);
        // Collections.sort(al2);
        
        // System.out.println(al2);
        // Collections.reverse(al2);
        
        // System.out.println(al2);
        // System.out.println(al);
        System.out.println(al.subList(0, 3));
        System.out.println(al);

        
    }
}
