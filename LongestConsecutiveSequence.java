
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public class LongestConsecutiveSequence {
    static int lcs(List<Integer> li){
        HashSet<Integer> hs=new HashSet<>();
        int maxnum=0;
        ArrayList<Integer> ar=new ArrayList<>();
        for(int a: li){
            if (hs.contains(a)) {
                continue;
            }
            hs.add(a);
        }
        for(int a: hs){
            System.out.println("-"+a);
        }

        for(int a: hs ){
            if (hs.contains(a-1)) {
                System.out.println("la continue"+a);
                continue;
            }

            for (int i=0; i< hs.size();i++) {
                if (hs.contains(a+i)) {
                    ar.add(a);
                    System.out.println("ehh"+a);
                }
                else{
                    maxnum=Math.max(maxnum, ar.size());
                    ar.clear();
                    System.out.println("hmmmm"+a);
                    
                    break;
                }
            }

        }
return maxnum;
    }
    public static void main(String[] args) {
        List<Integer> ls=Arrays.asList(100,103,104,105,106,107,1,101,3,5,102,2,4);

        int res=lcs(ls);
        System.out.println("the answer is "+res);
    }
}
