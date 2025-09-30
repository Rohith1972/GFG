class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length;
        int m = b.length;
        int[] res = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(a[i]<b[j])
                res[k++]=a[i++];
            else
                res[k++]=b[j++];
        }
        while(i<n)
            res[k++] = a[i++];
        while(j<m)
            res[k++] = b[j++];
        for(int p=0;p<n;p++){
            a[p] = res[p];
        }
        for(int q=0;q<m;q++){
            b[q]=res[n+q];
        }
    }
}
