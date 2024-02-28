import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Ravi");
        al.add("vijay");
        al.add("Ajay");

        System.out.println(al);

        al.add(1,"Gaurav");
        System.out.println(al);
        ArrayList<String> al2=new ArrayList<>();
        al2.add("sonoo");
        al2.add("hanumat");

        al.addAll(al2);
        System.out.println(al);
        ArrayList<String> al3=new ArrayList<>();
       al3.add("john");
       al3.add("Rahul");
       al.remove(0);
       System.out.println("after remove 0 element:"+al);
       al.removeAll(al2);
       System.out.println("after removing all :"+al);
       al.addAll(al3);
       System.out.println(al.contains("john"));
       al.clear();
       System.out.println(al);
    }
}
