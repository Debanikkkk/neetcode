import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    static int[] productOfArrayExceptSelf(int[] arr) {
        int[] ans = new int[arr.length];
        Arrays.fill(ans, 1);
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                ans[j] = ans[j] * arr[j];
            }

            System.out.println("from the loop of mult");
            for (int a : ans) {
                System.out.println(a + ", ");
            }
            int temp = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
            System.out.println("from the loop of rotate");
            for (int a : arr) {
                System.out.println(a + ", ");
            }
        }
        return ans;
    }

    static int[] productOfArrayExceptSelfOPTIMAL(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);

        int pre = 1;
        int post = 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] = pre;
            pre = nums[i] * pre;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = post * result[i];
            post = post * nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4 };

        // int[] ans = productOfArrayExceptSelf(nums);
        int[] ansopt = productOfArrayExceptSelfOPTIMAL(nums);
        // for (int a : ans) {
        // System.out.println(a + ", ");
        // }

        for (int a : ansopt) {
            System.out.println(a + ", ");
        }

    }
}
