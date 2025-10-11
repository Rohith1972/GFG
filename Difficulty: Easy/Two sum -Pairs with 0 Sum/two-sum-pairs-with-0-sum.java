import java.util.*;

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(arr);

        int left = 0, right = arr.length - 1;

        // Step 2: Use two-pointer technique
        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == 0) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                res.add(pair);

                int leftVal = arr[left];
                int rightVal = arr[right];

                // Move both pointers to skip duplicates
                while (left < right && arr[left] == leftVal) left++;
                while (left < right && arr[right] == rightVal) right--;
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        return res;
    }
}
