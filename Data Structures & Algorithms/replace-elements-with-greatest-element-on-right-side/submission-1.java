class Solution {
    public int[] replaceElements(int[] arr) {
        
        int n=arr.length;
        int maxi=arr[n-1];
        int []ans=new int[n];
        ans[n-1]=-1;
        for(int i=n-2;i>=0;i--)
        {
             if(arr[i]<maxi)
             {
                ans[i]=maxi;
             }
             else{
                int nt=arr[i];
                ans[i]=maxi;
                maxi=nt;
             }
        }
        return ans;
    }
}