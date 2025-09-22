class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        int lessEqual = upperBound(arr, target);        
        int greaterEqual = arr.length - lowerBound(arr, target); 
        return new int[]{lessEqual, greaterEqual};
    }
    int lowerBound(int[] arr, int target) {
        int l = 0, h = arr.length;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] >= target)
                h = mid;
            else
                l = mid + 1;
        }
        return l;
    }
    int upperBound(int[] arr, int target) {
        int l = 0, h = arr.length;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] > target)
                h = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}
