class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(nums[i]))
            {
                mp.put(nums[i],mp.get(nums[i])+1);
            }
            else{
                mp.put(nums[i],1);
            }
        
        }
        boolean ans=false;
        for(int i:mp.values())
        {
            if(i>1)
            {
                ans=true;
                break;
            }
        }
        return ans;
    }
}
