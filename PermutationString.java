
import java.util.HashMap;
import java.util.Map;

public class PermutationString {

    static void printHashMap(HashMap<?, ?> map) {
    for (Map.Entry<?, ?> entry : map.entrySet()) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }
}
// time complexity O(m*n)
// space ocmplexity O()
static boolean permutationStringMYAPROACH(String s1, String s2){
    int x=0;
    HashMap<Character, Integer> hmp=new HashMap<>();

    for (int i=0; i< s1.length(); i++) {
        if (hmp.containsKey(s1.charAt(i))) {
            hmp.put(s1.charAt(i), hmp.get(s1.charAt(i))+1);
        }else{
        hmp.put(s1.charAt(i), 1);

        }
    }


    HashMap<Character, Integer> hm=new HashMap<>(hmp);
    while(x!=s2.length()){
        if (hm.containsKey(s2.charAt(x))) {
            
            hm.put(s2.charAt(x), hm.get(s2.charAt(x))-1);
            if (hm.get(s2.charAt(x))==0) {
                
                hm.remove(s2.charAt(x));
                System.out.println("the hashmap is ");
                printHashMap(hm);
            }
            if (hm.isEmpty()) {
                return true;
            }
        }
        else{
            hm=new HashMap<>(hmp);
        }
        x++;
    }

    return false;
}

static boolean permutationStringMYAPROACH2(String s1, String s2){
int l=0;
int r=s1.length()-1;
int count=0;
// this is our moving hashmap
HashMap<Character, Integer> hmp=new HashMap<>();

    for (int i=0; i< s1.length(); i++) {
        if (hmp.containsKey(s2.charAt(i))) {
            hmp.put(s2.charAt(i), hmp.get(s2.charAt(i))+1);
        }else{
        hmp.put(s2.charAt(i), 1);

        }
    }
// this is our main boss hashmap 
    HashMap<Character, Integer> hmp1=new HashMap<>();

    for (int i=0; i< s1.length(); i++) {
        if (hmp1.containsKey(s1.charAt(i))) {
            hmp1.put(s1.charAt(i), hmp1.get(s1.charAt(i))+1);
        }else{
        hmp1.put(s1.charAt(i), 1);

        }
    }
     
while (r!=s2.length()) { 
      if (count!=0) {
         if (hmp.containsKey(s2.charAt(r))) {
        hmp.put(s2.charAt(r), hmp.get(s2.charAt(r))+1);    
    }else{
        hmp.put(s2.charAt(r), 1);    

    }   
        }
    printHashMap(hmp);

    if (hmp.equals(hmp1)) {
        return true;
    }
else
    {
        System.out.println("this is happening after the main else block is being triggered");
       
         

        System.out.println("iteration "+r);
        // printHashMap(hmp);
 if (hmp.containsKey(s2.charAt(l)) && hmp.get(s2.charAt(l))>=1) {
    System.out.println("this condition was triggered for "+s2.charAt(l));
        hmp.put(s2.charAt(l), hmp.get(s2.charAt(l))-1);
        if (hmp.get(s2.charAt(l))==0) {
            System.out.println("removal condition reached");

            hmp.remove(s2.charAt(l));
            System.out.println("removal condition ended");

        }    

    }
    // hmp.remove(s2.charAt(l));
    l++;
    r++;
    // System.out.println("this is the value of r ");
  
   count++;
    }
    
}
return false;
}
public static void main(String[] args) {
    String s1="abs";
    String s2="afsbaufbesbeosuaab";

    System.out.println("this is "+permutationStringMYAPROACH2(s1, s2));
}
}
