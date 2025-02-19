import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        The following are the most frequently performed operations on List interface:
        1. Add elements: add() method, [add(Object 0), add(int index, Object O)]
        2. Access elements: get() method, get(int index)
        3. Replace elements: set() method, set(int index, Object o)
        4. Remove elements: remove() method, [remove(int index), remove(Object o)]
        5. Check if an element is present or not: contains() method, contains(Object o)
        6. Search an element of the list: indexOf(), lastIndexOf() methods, indexOf(Object o), lastIndexOf(Object o)
        7. Find size of the list: size() method
         */

/*
        List<String> stringList = new ArrayList<>();
        stringList.add("Streams API");
        stringList.add("Concurreny API");
        stringList.add("Date Time API");
        stringList.add("JDBC API");

        System.out.println("======================stringList");
        System.out.println(stringList);

        //Enhanced for loop to iterate through List
        System.out.println("\n======================stringList printed using enhanced for loop");
        for(String s : stringList) {
            //everything in here is considered as constant
            System.out.println(s);
        }
        //forEach method of Iterable interface
        System.out.println("\n======================stringList printed using forEach()");
        stringList.forEach(s -> {
            System.out.println(s);
        });

        //normal for loop and get() method of List interface
        int n = stringList.size();
        System.out.println("\n=======================StringList printed using normal for loop and get() method");
        for(int i=0;i<n;++i) {
            System.out.println(stringList.get(i));
        }

        //set() method of List interface
        stringList.set(1, "Collections API");
        System.out.println("\n"+stringList);

        //remove() method of List interface
        String removedString = stringList.remove(2);
        System.out.println("\n"+removedString+"is removed from the List");
        System.out.println(stringList);
*/
/*

        System.out.println(Search.linearSearch(List.of(3,1,10,6),100 ));
*/

/*

        List<Integer> list = new ArrayList<>(List.of(9,4,6,1,3,5));
        list.sort(Comparator.naturalOrder());
        System.out.println(Search.binarySearch(list,6));
*/

    }
}