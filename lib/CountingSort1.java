
import java.util.HashMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Collections;
import java.util.*;
public class CountingSort1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        Collections.addAll( arr,1,1,1,2,3,1);


        //counting sort 1
        // Integer[] arrayList = new Integer[100];
        // Arrays.fill(arrayList, 0);
        // for (int i: arr) {
        //     arrayList[i]++;
        //     System.out.println(arrayList[i]);
        // }
        
        //counting sort 2
        // Integer[] arrayList = new Integer[100];
        // List<Integer> arrList = new ArrayList<Integer>(Collections.nCopies(100, 0));
     
        // for (int i: arr) {
        //     // arrayList.
        //     arrList.replaceAll(i);
        //     arrList.add(i, arr.get(i));
            
        // }
        // arrList.sort(Comparator.naturalOrder());
        // System.out.println(arrList);

        Integer[] arrayList = new Integer[100];
        Arrays.fill(arrayList, 0);
        for (int i: arr) {
            arrayList[i]++;
            System.out.println(arrayList[i]++);
        }
        

        // System.out.println(arr);
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i = 1; i<arr.size(); i++){
        //     Integer singleValue = arr.indexOf(i);
        //     if(map.get(singleValue)==null){
        //         map.put(singleValue, 1);
        //     }else{
        //         map.put(singleValue, map.get(singleValue)+1);
        //     }
        // }
        
        // System.out.println(map.keySet());


    }
    
}
