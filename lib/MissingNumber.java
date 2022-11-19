
import java.util.Arrays;
import java.util.HashMap;
public class MissingNumber {

    public static void main(String[] args) {
        Integer[] nums = {9,6,4,2,3,5,7,0,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(nums);
        int count = 0;
        // int add 
        // System.out.println(Arrays.toString(nums));
        for(int i = 0; i<nums.length; i++){
            Integer singleValue = nums[i];
            if(map.get(singleValue)==null){
                map.put(singleValue, 1);
            }else{
                map.put(singleValue, map.get(singleValue)+1);
            }
            
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i]-count==0){
                // System.out.println(nums[i]);
                count++;
            }
            
            // if(map.get(map.keySet()))
        }
        System.out.println(count); 

        

    }
    
}
