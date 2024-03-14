import java.util.ArrayList;
import java.util.List;

public class Question13 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(List.of(1,2,3,4,5,6));
        ArrayList<Integer> al2=new ArrayList<>(List.of(1,2,3,4,5,6,7));
        // System.out.println(al.equals(al2));
        for(Integer i:al){
           boolean a= al2.contains(i)?true:false;
           System.out.println(a);
        }
    }
}
