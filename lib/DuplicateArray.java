import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DuplicateArray {
    public static void main(String[] args) {
        Integer[] nums = {4,3,2,7,8,2,3,1};

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<Integer>();


        for(int i = 0; i<nums.length; i++){
            Integer singleValue = nums[i];
            if(map.get(singleValue)==null){
                map.put(singleValue, 1);
            }else{
                map.put(singleValue, map.get(singleValue)+1);
            }
        }
        System.out.println("Map - "+map);
        System.out.println(map.values());

        map.forEach((key,value) -> {
            if(value==2){
                result.add(key);
            }
        });
    }

    // public static List<Integer> findDuplicates(int[] nums) {
    //     List<Integer> result = {};
        

        
    // }
    
}
