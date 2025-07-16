
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecode {
    static String encode(List<String> strs){
        if (strs.size()==0) {
            return Character.toString((char)258);
        }
        // String seperate=Character.toString(char(257));
        String seperate="#";

        StringBuilder sb=new StringBuilder();

        for (String s : strs) {
            sb.append(s);
            sb.append("#");
        }
sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
    
    
    
    
    static List<String> decode(String s){
        // for (int i=0; i<s.length(); i++) {
        //     sb.append(s.charAt(i));
        //     if (s.charAt(i)=='#' || i==s.length()-1) {
        //         sb.deleteCharAt(sb.length()-1);
        //         sl.add(sb.toString());
        //         sb.delete(0, sb.length());
        //     }
        // }
return Arrays.asList(s.split("#", -1));

    }

    public static void main(String[] args) {
        List<String> sl=Arrays.asList("Aple","Banan","Cheri");
        // sl={}
        String res=encode(sl);
        System.out.println("the result is "+res);

        List<String> sl2=new ArrayList<>();
        sl2=decode(res);

        for (String s : sl2) {
            System.out.println("the element decoded "+s);
        }
    }
    
}
