import java.util.ArrayList;
import java.util.List;
public class Question5 {
    public static void main(String[] args){
        // Write a Java program to update an array element by the given element.
        //key word [set]
        ArrayList<Integer> al=new ArrayList<Integer>(List.of(1,2,3,4));
        al.set(0, 9);
        System.out.println(al);
    }
}
