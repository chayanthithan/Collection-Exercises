import java.util.ArrayList;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        // Write a Java program to insert an element into the array list at the first position.
        ArrayList<String> al=new ArrayList<>(List.of("red","green","black"));
        al.add(0,"blue");
        al.add(0,"yellow");
        al.add(0,"purple");
        
    
        for(String x:al){
            System.out.println(x);
        }
    }
}
