import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question9 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(List.of(7,8,9,1,2,3,4,5));
        ArrayList<Integer> al2=new ArrayList<>(List.of(6,7,8,9,10,11));
        Collections.copy(al,al2);   //it will work
        Collections.copy(al2,al);   //it won't work  because al2 is smaller than al
        System.out.println(al2);
        System.out.println(al);
    }
}
