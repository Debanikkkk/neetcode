
// import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElements {
    static int[] topKFreq(int[] ar, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            if (hm.containsKey(ar[i])) {
                hm.put(ar[i], hm.get(ar[i]) + 1);
            } else {
                hm.put(ar[i], 1);
            }
        }

        Queue<Integer> heap = new PriorityQueue<>(
                (a, b) -> hm.get(a) - hm.get(b));

        for (int n : hm.keySet()) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = heap.poll();
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 12, 2, 24, 4, 5, 5, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 6, 1, 1, 1, 3, 3, 3, 2, 2, 2, 2, 2 };
        int[] ans = topKFreq(arr, 6);

        for (int a : ans) {
            System.out.println(a + ", ");
        }
    }

}
