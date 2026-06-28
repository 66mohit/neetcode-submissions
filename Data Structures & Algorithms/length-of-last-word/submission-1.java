class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int ans=0;
        int i=n-1;
        if(n==1)
        {
            return 1;
        }
        while(s.charAt(i)==' ')
        {
            i--;
            
        }
        
        while(s.charAt(i)!=' ')
        {
            ans+=1;
            i--;
        }

        return ans;
    }
}