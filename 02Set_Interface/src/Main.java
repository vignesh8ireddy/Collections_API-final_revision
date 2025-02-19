import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*
        Here are the most frequently performed operations on HashSet:
        1. add()
        2. remove()
        3. contains()
        */

        Set<String> stringSet = new HashSet<>();
        stringSet.add("JDBC");
        stringSet.add("Collections");
        stringSet.add("Concurreny");
        stringSet.add("Date and Time");
        System.out.println(stringSet);
        System.out.println("\n=============================stringSet printed using enhanced for loop");
        for(String s:stringSet) {
            System.out.println(s);
        }
        System.out.println("\n=============================stringSet printed using iterator");
        Iterator<String> stringIterator = stringSet.iterator();
        while(stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }

        System.out.println(stringSet.remove("JDBC"));//true
        System.out.println(stringSet.remove("JDBC"));//false
    }
}