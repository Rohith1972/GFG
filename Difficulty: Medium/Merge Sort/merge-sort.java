class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l<r){
            int m = l+(r-l)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,m,l,r);
        }
    }
    void merge(int[] arr,int m,int l,int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for(int i=0;i<n1;i++){
            L[i] = arr[i+l];
        }
        for(int i=0;i<n2;i++){
            R[i] = arr[i+m+1];
        }
        int i=0,j=0;
        int k = l;
        while(i<n1 && j<n2){
            if(L[i]<R[j]){
                arr[k++] = L[i++];
            }else{
                arr[k++] = R[j++];
            }
        }
        while(i<n1){
            arr[k++] = L[i++];
        }
        while(j<n2){
            arr[k++] = R[j++];
        }
    }
}