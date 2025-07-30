

class TwoSumII{
    static int[] twoSumII(int[] ar, int target){
        int l=0;
        int r=ar.length-1;
System.out.println("l value before loop");

        while (l<r) { 
System.out.println("l value in loop "+l);

            System.out.println("entered loop");
            if (ar[l]+ar[r]<target) {
            System.out.println("entered cond1 "+l+" "+r);

                l++;
            }else if(ar[l]+ar[r]>target) {
            System.out.println("entered cond2");

                r--;
            }else{
            System.out.println("entered cond3");

                  return new int[]{ar[l], ar[r], l, r};
            }
        }
      return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] ar={1,2,6,4};
        int[] ans=twoSumII(ar, 8);

        for(int a: ans){
            System.out.println(a+"->");
        }
    }
}