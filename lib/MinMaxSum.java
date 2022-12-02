import java.util.*;  
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class MinMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        Collections.addAll(arr, 7, 69, 2, 221, 8974);
        
        long sum =0, minSum =0, maxSum =0;
        long max =0, min =arr.get(0);
        for(long i : arr)
        {
            sum += i;
            if(max<i)
            {
                
                max =i;
            }
           else if(min>i)
            {
                System.out.println(i);
                min =i;
            }
        }
        minSum = sum - max;
        maxSum = sum - min;
        System.out.println(minSum+" "+maxSum);
        
        // int i = 0;
        // int j = 0;
        // int sumMin = 0;
        // int sumMax = 0;

        // for(j = 0; j<(arr.size()-1);j++){
        //     sumMin +=arr.get(j);
        // }

        // for(i = 1; i<arr.size(); i++){
        //     sumMax += arr.get(i);
        //     System.out.println(sumMax);
        // }

        // System.out.println(sumMin+ " " + sumMax);
        
    }
    
}
