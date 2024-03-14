import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        //Write a Java program to iterate through all elements in an array list.
        ArrayList<String> al=new ArrayList<>(List.of("red","green","white","black","yellow"));
        Iterator<String> it=al.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
