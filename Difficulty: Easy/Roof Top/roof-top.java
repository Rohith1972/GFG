class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        int n = arr.length;
        int maxSteps = 0, currSteps = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                currSteps++;
                maxSteps = Math.max(maxSteps, currSteps);
            } else {
                currSteps = 0;
            }
        }
        return maxSteps;
    }
}