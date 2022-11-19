import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
public class LeftRotation {
    public static void main(String[] args) {
        int d = 2;
        List<Integer> arr = new ArrayList<Integer>();
        Collections.addAll(arr, 1,2,3,4,5);
        int i = 0;
        List<Integer> arrayList = new ArrayList<Integer>();

        for(i =d; i<arr.size(); i++){
            // System.out.println(i);
            arrayList.add(arr.set(i, 1));
        }
        for(i =0; i<d; i++){
            System.out.println(i);
            arrayList.add(arr.set(i, i+1));
        }
        System.out.println(arrayList);
    }
    
}
