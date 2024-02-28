import java.util.*;

class StackEmptyMethodExample{
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();

        boolean result=stk.empty();
        System.out.println("is empty:"+result);

        stk.push(78);
        stk.push(40);
        stk.push(50);
        stk.push(20);
        System.out.println("elements in stack:"+stk);
        result=stk.empty();
        System.out.println("result:"+result);
    }
}