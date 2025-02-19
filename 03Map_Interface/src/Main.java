import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /*
        The following are the most frequently used Map interface methods:
        1. put() method: to add key, value and to change value
        2. get() and getOrDefault() methods
        3. containsKey() and containsValue()
        4. remove()
        5. keySet() method: gives set of all the keys
        6. entrySet() method: gives set of Entry objects Entry(key value pairs)
         */
/*

        Map<Integer, String> hMap = new HashMap<>();
        hMap.put(500,"Tony");
        hMap.put(501,"Steve");
        hMap.put(502,"Thor");
        hMap.put(503,"Bruce");
        hMap.put(504,"Natasha");
        hMap.put(505,"Clint");
        hMap.put(506,"Strange");
        System.out.println(hMap);
        System.out.println("\n==========================entrySet()");
        System.out.println(hMap.entrySet());

        System.out.println("\n==========================hMap printed using enhanced for loop");
        for(Map.Entry<Integer,String> e:hMap.entrySet()) {
            System.out.println(e.getKey()+":"+e.getValue());
        }
*/

        System.out.println(sumOfNNaturalNumbers(6));
    }

    public static int sumOfNNaturalNumbers(int n) {
        return (n==1) ? n : (n+sumOfNNaturalNumbers(n-1));
    }
}