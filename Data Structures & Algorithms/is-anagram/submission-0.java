class Solution {
    public boolean isAnagram(String s, String t) {
         HashMap<Character,Integer>np=new HashMap<>();
         HashMap<Character,Integer>mp=new HashMap<>();
         int n=s.length();
         int m=t.length();
         if(n!=m)
         {
            return false;
         }
         for(int i=0;i<n;i++)
         {
            if(np.containsKey(s.charAt(i)))
            {
                np.put(s.charAt(i),np.get(s.charAt(i))+1);
            }
            else{
                np.put(s.charAt(i),1);
            }
         }
          for(int i=0;i<m;i++)
         {
            if(mp.containsKey(t.charAt(i)))
            {
                mp.put(t.charAt(i),mp.get(t.charAt(i))+1);
            }
            else{
                mp.put(t.charAt(i),1);
            }
         }
         return np.equals(mp);

    }
}
