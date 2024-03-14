import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question10 {
    public static void main(String[] args) {
        // Write a Java program to shuffle elements in an array list.
        ArrayList<Integer> al=new ArrayList<>(List.of(1,2,3,4,5,6,7));
        ArrayList<Integer> al2=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        Collections.shuffle(al);
        Collections.shuffle(al2);
        System.out.println(al);
        System.out.println(al2);
        System.out.println(al2);
    }
}
