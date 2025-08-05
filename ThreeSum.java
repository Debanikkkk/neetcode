
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum{

    static List<List<Integer>>threeSum(int[] nums){
    Arrays.sort(nums);    
    List<List<Integer>> ans=new ArrayList<>();


    for (int i=0; i<nums.length && nums[i]<=0; i++) {
        int l=i+1;
        int r=nums.length-1;

        while (l<r){            
            if (nums[l]+nums[r]<(-1)*(nums[i])){
                l++;
            }else if (nums[l]+nums[r]>(-1)*(nums[i])) {
                r--;
            }else{
                List<Integer> a=new ArrayList<>(3);

                a.add(nums[l]);
                 a.add(nums[r]);
                 a.add(nums[i]);
                ans.add(a);
                // a.clear();
            }
        }
    }
    return ans;
    }
    public static void main(String[] args) {
    int[] a=new int[]{0,1,2,5,1,0,-3,-5,-5};
        
        List<List<Integer>> ans=threeSum(a);

        for (List<Integer> el: ans) {
            for(int e: el){
                System.out.println(e+", ");
            }
        }




    }
}