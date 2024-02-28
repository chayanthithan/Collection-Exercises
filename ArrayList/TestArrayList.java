import java.util.*;
public class TestArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        al.add(1);
        al.add(10);
        al.add(9);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println(al);
        Iterator<Integer> it=al.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        //It is used to return a shallow copy of an ArrayList.
       // System.out.println(al.clone());
        System.out.println("\n index of specified element"+al.indexOf(10));
        al.remove(3);
        System.out.println("after removed an element:"+al);
    
        // al2.addAll(al);
        // al2.add(20);
        // al2.add(10);
        // al2.add(30);
        // System.out.println(al2);
    }
}