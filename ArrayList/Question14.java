import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question14 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(List.of(1,2,3,4,5,6));
        ArrayList<Integer> al2=new ArrayList<>(List.of(1,2,3,4,5,6));
        Collections.swap(al, 0, 5);
        // for(int i=0;i<al.size()-1;i++){
        //     int a=al.get(i);
        //     int b=al.get(i+1);
        //     System.out.println("a:"+a);
        //     System.out.println("b:"+b);
        //     al.set(i,b);
        //     al.set(i+1,a);

        // }
        for(int x:al){
            System.out.print(x+" ");
        }
        
    }
}
