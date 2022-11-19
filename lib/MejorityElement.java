import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MejorityElement {
    public static void main(String[] args) {
        Integer[] nums = {2,2,1,1,1,2,2};

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<Integer>();
        int index = 0;

        for(int i = 0; i<nums.length; i++){
            Integer singleValue = nums[i];
            if(map.get(singleValue)==null){
                map.put(singleValue, 1);
            }else{
                map.put(singleValue, map.get(singleValue)+1);
            }
            System.out.println("map "+map.get(nums[i])+ "length " + nums.length/2);
            if (map.get(nums[i])>nums.length/2) {
                index = nums[i];
                // System.out.println(index);
                break;
            }
        }

        // System.out.println(map.values());
        

       
    }
    
}
