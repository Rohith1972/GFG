class Solution {
    static int inversionCount(int arr[]) {
        // Code Here
        return mergeSort(arr,0,arr.length-1);
    }
    public static int mergeSort(int[] arr, int l, int r){
        int count = 0;
        if(l<r){
            int mid = l+(r-l)/2;
            count+=mergeSort(arr,l,mid);
            count+=mergeSort(arr,mid+1,r);
            count+=merge(arr,mid,l,r);
        }
        return count;
    }
    static int merge(int[] arr,int m,int l,int r){
        int count = 0;
        int n1 = m-l+1;
        int n2 = r-m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i=0;i<n1;i++){
            L[i] = arr[i+l];
        }
        for(int i=0;i<n2;i++){
            R[i] = arr[m+i+1];
        }
        int i=0,j=0;
        int k = l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j])
                arr[k++] = L[i++];
            else{
                arr[k++] = R[j++];
                count += n1-i;
            }
        }
        while(i<n1){
            arr[k++] = L[i++];
        }
        while(j<n2){
            arr[k++] = R[j++];
        }
        return count;
    }
}