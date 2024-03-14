package Map;
import java.util.*;

public class FindBigString {
    public static void main(String[] args) {
        String str;
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter string:");
        str=scn.nextLine();

        List<Character> al=new ArrayList<>();
        Map<Integer,String> map=new HashMap<>();
        int maxLength=0;
        for(int i=0;i<str.length();i++){
            Character letter=str.charAt(i);
            String getString="";
            if(al.contains(letter)){
                int x=al.indexOf(letter);
                Iterator it=al.iterator();
                while(it.hasNext()){
                    getString+=it.next();
                }
                map.put(getString.length(),getString);
                if(getString.length()>maxLength){
                    maxLength=getString.length();
                }
                al.removeAll(al);
                al.add(letter);
            }else{
                al.add(letter);
            }
            
        }
       if(!al.isEmpty()){
        Iterator iterate=al.iterator();
        String finalString="";
        while(iterate.hasNext()){
            finalString+=iterate.next();
        }
        map.put(finalString.length(),finalString);
        if(maxLength<finalString.length()){
            maxLength=finalString.length();
        }
    }
    
        System.out.println("this is the maximum non repeat string:"+map.get(maxLength)+ "length is"+maxLength);
    }
}
