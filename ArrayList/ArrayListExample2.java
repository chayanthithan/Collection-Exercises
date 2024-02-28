import java.util.*;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");
        al.add("Orange");

        Iterator it=al.iterator();
       while(it.hasNext()){
        System.out.println(it.next());
       }
       System.out.println("-------------------------------");
       for(String str:al){
        System.out.println(str);
       }
       System.out.println("----------------------------");
       System.out.println("1 index element:"+al.get(1));
       System.out.println("--------------------------------");
       al.set(1, "Dates");
       for(String x:al){
        System.out.println(x);
       }
       System.out.println("-----------sort list------------------");
       Collections.sort(al);
       for(String sl:al){
        System.out.println(sl);
       }
    }
}
