import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayDS {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        Collections.addAll(a, 1,2,3,4,5);
        reverseArray(a);


        
    }

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
            List<Integer> arrayList = new ArrayList<Integer>();
    
            for(int i =a.size()-1; i>=0; i--){
                arrayList.add(a.set(i, 1));
                
            }
            System.out.println(arrayList);
            return arrayList;
        }
    
}
