import java.util.HashMap;

public class FirstUniqueCharecter {
    public static void main(String[] args) {
        String s = "loveleetcode";
        HashMap<Character, Integer> map = new HashMap<>();
        int i;
        int result = 0;

        for(i=0; i<s.length();i++){
            Character c = s.charAt(i);
            map.put(c, map.getOrDefault(s.charAt(i),0)+1);
        }

        for(i=0; i<map.size();i++){
            if(map.get(s.charAt(i)) == 1){
                result = i;
                System.out.println("result"+result);
                break;
            }
        }

        

        


    }
}
