import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question11 {
    public static void main(String[] args) {
        //Write a Java program to reverse elements in an array list.
        ArrayList<Integer> al=new ArrayList<>(List.of(9,8,7,6,5,4));
        ArrayList<Character> al2=new ArrayList<>(List.of('a','b','c','d','e','f'));
        ArrayList<String> al3=new ArrayList<>(List.of("apple","orange","pineapple","banana"));
        Collections.reverse(al);
        Collections.reverse(al2);
        Collections.reverse(al3);
        System.out.println(al);
        System.out.println(al2);
        System.out.println(al3);
        
    }
}
