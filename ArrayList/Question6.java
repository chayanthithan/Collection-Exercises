import java.util.ArrayList;
import java.util.List;

public class Question6 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(List.of(1,2,3,4,5));
        ArrayList<Integer> al2=new ArrayList<>(List.of(4,5));
        // al.remove(1);   //remove the particular index which index i have passed
        al.removeAll(al2);  //remove the arrayList
        System.out.println(al);
    }
}
