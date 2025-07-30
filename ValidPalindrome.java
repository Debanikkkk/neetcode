class ValidPalindrome{
    static boolean validPalindrome(String s){
        int l=0;
        int r=s.length()-1;
        System.out.println("this is l "+l+" and this is r "+r);
        char[] carr=s.toCharArray();
            while(l<r) {
        System.out.println("in loop this is l "+l+" and this is r "+r);  
           while (l<r && !Character.isLetterOrDigit(s.charAt(l))) { 
               l++;
           }
           while (l<r && !Character.isLetterOrDigit(s.charAt(r))) { 
               r--;
           }

         
           if (Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))) {
                return false;
           }
           l++;
           r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="f:ss:eee:ssf";

        System.out.println(validPalindrome(str));
    }
}