import java.util.HashMap;


public class LongestRepeatingCharacter {
    static int findMax(HashMap<Character, Integer> hm){
        int max=0;
        for (char c: hm.keySet()) {
            max=Math.max(max, hm.get(c).intValue());
        }
        return max;
    }
    static int longestRepeatingCharacter(String str, int k){
       int[] occurance=new int[26];
       int left=0;
    //    int right=0;
       int ans=0;
       int maxOccurance=0;

       for (int right=0; right<str.length(); right++) {
           maxOccurance=Math.max(maxOccurance, ++occurance[str.charAt(right)-'A']);
            if (right-left+1-maxOccurance>k) {
                occurance[str.charAt(left)]--;
                left++;
            }
            ans=Math.max(ans, right-left);
        }
return ans;
    }
    public static void main(String[] args) {
        String test="absab";
        int k=2;

        System.out.println("the answer is "+longestRepeatingCharacter(test, k));
    }
}
