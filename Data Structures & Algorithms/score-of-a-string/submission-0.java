class Solution {
    public int scoreOfString(String s) {
        int ans=0;
        int n=s.length();
        int i=0;
        int j=1;
        while(j<n)
        {
            ans+=Math.abs((int)s.charAt(j)-(int)s.charAt(i));
            i++;
            j++;
        }
        return ans;
    }
}