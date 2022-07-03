import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        linkedHashMap.put(1,"Mango");
        linkedHashMap.put(2,"Apple");
        linkedHashMap.put(3,"Orange");
        linkedHashMap.put(4,"PineApple");
        linkedHashMap.put(5,"Guava");
        linkedHashMap.put(6,"Peach");
        linkedHashMap.put(7,"Palm");
        linkedHashMap.put(8,"WaterMelon");
        linkedHashMap.put(9,"SweetMelon");
        linkedHashMap.put(10,"Santra");

        System.out.println(linkedHashMap);
        for (Integer key : linkedHashMap.keySet()) {
            System.out.println(key + ":\t" + linkedHashMap.get(key));
        }
        linkedHashMap.remove(4);
        linkedHashMap.remove(7);

        System.out.println("If banana is there: "+linkedHashMap.containsValue("Banana"));
        System.out.println("Check fourth key: "+linkedHashMap.containsKey(4));
        System.out.println("Hash Code: "+linkedHashMap.hashCode());
        linkedHashMap.clear();
        System.out.println("The map is "+linkedHashMap);


    }
}
