import java.util.ArrayList;
import java.util.List;

public class Question7 {
    public static void main(String[] args) {
        // Write a Java program to search for an element in an array list.
        //contains
        ArrayList<Integer> al=new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println(al.contains(7));
        System.out.println(al.contains(6));
    }
}
