import java.util.*;
public class StackPushPopExample {
    static void pushelmnt(Stack stk,int x){
    //    stk.push(new Integer(x)); //why we have to give like this
       stk.push(x);
        System.out.println("push->"+x);
        System.out.println("stack->"+stk);
    }
    static void popelmnt(Stack stk){
        int x=(int)stk.pop();
        System.out.println("pop->");
        System.out.println("stack->"+stk);
    }
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        pushelmnt(stk,20);
        pushelmnt(stk,10);
        pushelmnt(stk,40);
        pushelmnt(stk,5);
        pushelmnt(stk,15);
        popelmnt(stk);
        popelmnt(stk);
        popelmnt(stk);

    }
}
