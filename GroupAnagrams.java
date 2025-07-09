import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class GroupAnagrams {
    static List<List<String>>groupAnagrams(String[] ar){
    int[] zar=new int[26];
     HashMap<String, ArrayList<String>> hm=new HashMap<>();

     for(String ar1: ar){
        Arrays.fill(zar, 0);

        for(char c: ar1.toCharArray()){
            zar[c-'a']++;
        }

        StringBuilder sb=new StringBuilder();
      
        for(int z: zar){
            sb.append(z);
            sb.append('#');
        }
          String key=sb.toString();
        if(!hm.containsKey(key)){
            hm.put(key, new ArrayList());
        }

        hm.get(key).add(ar1);
      
     }
      System.out.println("this is the ");
return new ArrayList(hm.values());

    }

    public static void main(String[] args) {
        String[] ar=new String[]{"tab","cat","bat","tca","cra","arc"};
        List<List<String>> al=groupAnagrams(ar);
     for (int i = 0; i < al.size(); i++) {
    System.out.println("Group " + (i + 1) + ":");
    for (String word : al.get(i)) {
        System.out.println("  " + word);
    }
}
    }
}
