// import java.util.
public class ContianerMaxWater {
    static int containerMaxWaterBF(int[] ar){
        int maxvol=0;
        for (int i=0; i<ar.length; i++) {
         for (int j=0; j<ar.length; j++) {
            maxvol=Math.max(maxvol, Math.min(ar[i], ar[j])*Math.abs(i-j));
        }   
        }
        return maxvol;
    }

    static int containerMaxWaterOPT(int[] ar){
        int l=0;
        int r=ar.length-1;
        int maxvol=0;
        while (l<r) { 
            maxvol=Math.max(maxvol, Math.min(ar[l], ar[r])*Math.abs(r-l));

            if (ar[l]<=ar[r]) {
                l++;    
            }
            else {
                r--;
            }

        }

        return maxvol;
    }
    public static void main(String[] args) {
        int[] ar=new int[]{2,5,3,1,3,2,4,1};
        System.out.println("the answer is "+containerMaxWaterBF(ar));
        System.out.println("the optimal answer is "+containerMaxWaterOPT(ar));
    }
}
