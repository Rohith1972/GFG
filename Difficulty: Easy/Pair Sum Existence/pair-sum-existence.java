class Geeks {
    public static int sumExists(int arr[], int n, int target) {
        // add your code here
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while(i<j){
            int res = arr[i]+arr[j];
            if(res==target)
                return 1;
            else if(res<target)
                i++;
            else
                j--;
        }
        return 0;
    }
}