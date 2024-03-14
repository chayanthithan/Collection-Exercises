import java.util.ArrayList;
import java.util.List;

public class Question15 {
    public static void main(String[] args) {
         ArrayList<Integer> al=new ArrayList<>(List.of(1,2,3,4,5,6));
        ArrayList<Integer> al2=new ArrayList<>(List.of(1,2,3,4,5,6));
        ArrayList<Integer> al3=new ArrayList<>();
        al3.addAll(al);
        al3.addAll(al2);
        System.out.println(al3);
        for(int x:al3){
            System.out.println(al3+",");
        }

    }
}
