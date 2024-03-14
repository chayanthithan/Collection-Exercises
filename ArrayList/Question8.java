import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question8 {
    public static void main(String[] args) {
        //Write a Java program to sort a given array list.
        //Collectons.sort()
        ArrayList<Integer> al=new ArrayList<>(List.of(4,3,5,1,2,10,9,7));
        Collections.sort(al);
        System.out.println(al);
    }
}
