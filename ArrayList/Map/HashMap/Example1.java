package Map.HashMap;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("Maths", 40);
        map.put("science", 50);
        map.put("history", 60);
        map.put("tamil", 70);
        Map<String,Integer> map2=Map.of("ict",50,"physics",40);
        Map<String,Integer> map3=Map.of("ict",40,"physics",40);
    //   System.out.println(map2.equals(map3)); //value as well as key should be equal

       int x=map.get("Maths");
       x++;
       map.put("Maths",x);
       
        System.out.println(map);
        // System.out.println(map);
        // for(Map.Entry<String,Integer> e:map.entrySet()){
        //     System.out.println(e.getKey()+" "+e.getValue());
        // }
        // System.out.println(map.get("Maths"));
        // map.clear();
        // System.out.println(map);
        // System.out.println(map.containsKey("ict"));
        // System.out.println(map.containsValue(70));
        // System.out.println(map.entrySet());
        // System.out.println(map2);
        // // System.out.println(map3);4
        // for(Map.Entry e:map3.entrySet()){
        //     System.out.println(e);
        // }
    }
}
