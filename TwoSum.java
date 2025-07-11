import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {

    static int[] twoSum(int[] nums, int target) {
        HashSet<Integer> hm = new HashSet<>();
        for (int num : nums) {
            hm.add(num);
        }

        for (int n : nums) {
            if (hm.contains(target - n)) {
                return new int[] { target - n, n };
            }
        }

        return new int[] { -1, -1 };
    }

    static int[] twoSumIndices(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])) {
                return new int[] { hm.get(target - nums[i]), i };
            }
            hm.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] n = new int[] { 1, 3, 5, 8 };

        int[] ans = twoSumIndices(n, 8);

        for (int an : ans) {
            System.out.println("the answer is " + an);

        }

    }

}
