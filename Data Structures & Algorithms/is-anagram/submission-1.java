class Solution {
    public boolean isAnagram(String s, String t) {
         HashMap<Character,Integer>mp1=new HashMap<>();
         HashMap<Character,Integer>mp2=new HashMap<>();
        int n=s.length();
        int m=t.length();
        if(n!=m)
        {
            return false;
        }
        for(int i=0;i<n;i++)
        {
            if(mp1.containsKey(s.charAt(i)))
            {
                mp1.put(s.charAt(i),mp1.get(s.charAt(i))+1);
            }
            else{
                mp1.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<m;i++)
        {
            if(mp2.containsKey(t.charAt(i)))
            {
                mp2.put(t.charAt(i),mp2.get(t.charAt(i))+1);
            }
            else{
                mp2.put(t.charAt(i),1);
            }
        }
         return mp1.equals(mp2);

    }
}
