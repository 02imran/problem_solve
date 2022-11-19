import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String s = "a";
        String t = "ab";
        isAnagram(s, t);
        
    }

    public static boolean isAnagram(String s, String t) {
        boolean isAnagram = false;

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();

        if(s.length()==t.length()){
            for(int i=0; i<s.length(); i++){
                Character c = s.charAt(i);
                if(map.get(c)==null){
                    map.put(c, 1);

                }else{
                    map.put(c, map.get(c)+1);
                }
                // map.put(c, map.getOrDefault(s.charAt(i), 0)+1);
                
            }
            System.out.println(map.size());
            for(int j=0; j<t.length(); j++){
                Character c = t.charAt(j);
                if(map1.get(c)==null){
                    map1.put(c, 1);

                }else{
                    map1.put(c, map1.get(c)+1);
                }
                
            }
            System.out.println(map1.toString());
            System.out.println(map.toString());

        }else{
            isAnagram = false;
        }
        if(map.equals(map1)){
            isAnagram = true;
            System.out.println(isAnagram);
        }else{
            isAnagram = false;
        }
        return isAnagram;
    }
    
}
