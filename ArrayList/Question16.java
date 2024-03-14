import java.util.ArrayList;
import java.util.List;

public class Question16 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(List.of(1,2,3,4,5,6,7));
        @SuppressWarnings("unchecked")
        ArrayList<Integer> al2=(ArrayList<Integer>)al.clone();
        System.out.println(al2);
    }
}
