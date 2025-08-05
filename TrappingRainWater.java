public class TrappingRainWater {
static int trappingRainWaterBF(int[] ar){
    int totalvol=0;
    int l=0;
    int r=1;

    while(l!=ar.length-1){
        if (r==ar.length-1 && ar[r]<ar[l]) {
            l++;
            r=l+1;
        }
        if (ar[r]>ar[l]) {
            int diff=0;
            if (l-r>1) {
            for(int i=l; i<r; i++){
                diff+=ar[i];
            }    
            }
            
                        totalvol+=Math.min(ar[r],ar[l])*Math.abs(r-l-1)-diff;
            l=r;
            // r=l;
        }
        r++;
    }


    return totalvol;
}
    public static void main(String[] args) {
    int[] ar=new int[]{4,2,0,3,2,5};

    System.out.println(trappingRainWaterBF(ar));


}    
}
