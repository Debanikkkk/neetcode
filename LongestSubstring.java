
import java.util.HashSet;

public class LongestSubstring {
    static int longestSubstringLengthBF(String s){

        if (s.length()==0) {
            return 0;
        }
        if (s.length()==1) {
            return 1;
        }
    int l=0;
    int r=0;
    int ans=0;
    HashSet<Character> hs=new HashSet<>();

    while (r<s.length()) { 
        char c =s.charAt(r);
        while (hs.contains(c)) { 
            hs.remove(s.charAt(l));
            l++;
        }
        hs.add(s.charAt(r));
        ans=Math.max(ans, r-l+1);
        r++;
    }
    return ans;
        }
    public static void main(String[] args) {
        String s="abcbads";
        System.out.println(longestSubstringLengthBF(s));

    }
}
