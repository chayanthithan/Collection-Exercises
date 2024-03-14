import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;


class HackerRankQuestion_set {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        ls.add(sc.nextInt());
    }
    System.out.println(ls);
    //for insert
    System.out.println("insertion enter element and index");
    int element=sc.nextInt();
    int index=sc.nextInt();
    ls.add(index,element);
    System.out.println(ls);
    //for delete
    System.out.println("enter index for delete particular element");
    int deleteIndex=sc.nextInt();
    ls.remove(deleteIndex);
    
    
    Iterator<Integer> it=ls.iterator();
    String str="";
    while(it.hasNext()){
        System.out.print(it.next()+" ");
      
    }
    
    }
}
