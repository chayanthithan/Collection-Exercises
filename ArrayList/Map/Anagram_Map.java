package Map;
import java.util.Map;
import java.util.HashMap;
public class Anagram_Map {
    public static void main(String[] args) {
         String str1="caarre";
         String str2="rraace";

    Map<Character,Integer> map=new HashMap<>();
    Map<Character,Integer> map2=new HashMap<>();

        if(str1.length()!=str2.length()){
            System.out.println("length is different so it is not a anagrams");
        }else{
            for(int i=0;i<str1.length();i++){
                if(map.containsKey(str1.charAt(i)))
                {
                    int x=map.get(str1.charAt(i));
                    map.put(str1.charAt(i),++x);
                }else{
                    map.put(str1.charAt(i),1);
                }
                
            }
            for(int i=0;i<str2.length();i++){
                if(map2.containsKey(str2.charAt(i)))
                {
                    int x=map2.get(str2.charAt(i));
                    map2.put(str2.charAt(i),++x);
                }else{
                    map2.put(str2.charAt(i),1);
                }
                
            }
        }
        if(map.equals(map2))
            System.out.println("it is a anagrams");
        else
            System.out.println("it is not anagrams");
    //    System.out.println(map);
    //    System.out.println(map2);


    }
   

}
