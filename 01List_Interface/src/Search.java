import java.util.ArrayList;
import java.util.List;

class Search {

    public static int linearSearch(List<? extends Number> list, Number key) {
        /*
        if(list.contains(key)) {
            return list.indexOf(key);
        }
        return -1;
        */
        /*
        return list.contains(key) ? list.indexOf(key) : -1;
        */

        int n = list.size();
        for(int i=0;i<n;i++) {
            if(list.get(i) == key) {
                return i;
            }
        }
        return -1;

    }

    public static int binarySearch(List<Integer> sortedList, Integer key) {
        int i=0;
        int j=sortedList.size()-1;
        int mid;
        while(i<=j) {
            mid = (i+j)/2;
            if(key == sortedList.get(mid)) {
                return mid;
            }
            else if(key < sortedList.get(mid)) {
                j = mid-1;
            }
            else
                i = mid+1;
        }
        return -1;
    }
}