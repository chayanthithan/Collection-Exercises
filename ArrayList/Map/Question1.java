package Map;

import java.util.HashMap;
import java.util.Map;

public class Question1{
    //map interface 
    //hashMap
    //linkedhashmap
    //treemap
   public static void main(String[] args) {
    Map<String, String> hm  = new HashMap<String, String>(); 
    hm.put("name", "chayan");
    hm.put("age", "25");
    hm.put("address", "kilinochchi");
    hm.put("grade", "13");

    for(Map.Entry items:hm.entrySet()){
        System.out.println(items.getKey()+" "+items.getValue());
    }

    System.out.println(hm);
    
   }
   
    
}
