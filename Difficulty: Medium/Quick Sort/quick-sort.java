class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot);
            quickSort(arr,pivot+1,high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        // code here
        int randomIndex = low + (int)(Math.random() * (high - low + 1));
        swap(arr, low, randomIndex);
        int i = low-1;
        int j = high+1;
        int pivot = arr[randomIndex];
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j) return j;
            swap(arr,i,j);
        }
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}