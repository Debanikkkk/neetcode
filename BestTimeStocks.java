public class BestTimeStocks {
static int bestTimeStocksBF(int[] ar){
    int diff=0;

    for(int i=0; i<ar.length-1;i++){
        for(int j=i; j<ar.length; j++){
            diff=Math.max(diff, ar[j]-ar[i]);
        }
    }
    return diff;
}

static int bestTimeStocksOPT(int[] ar){
    int l=0;
    int r=1;
    int max=Integer.MIN_VALUE;
    while (r!=ar.length) { 
        max=Math.max(max, ar[r]-ar[l]);
        if (ar[r]<ar[l]) {
            l=r;
            r=l;
        }
        r++;
    }
        if (max<0) {
            return 0;
        }
    return max;
}
    public static void main(String[] args) {
    int[] ar=new int[]{7,1,5,3,6,4};
        System.out.println("the answer is "+bestTimeStocksBF(ar));
        System.out.println("the OPTIMAL answer is "+bestTimeStocksOPT(ar));
}

}
