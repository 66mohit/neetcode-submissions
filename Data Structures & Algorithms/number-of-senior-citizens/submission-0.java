class Solution {
    public boolean c(String d) {
        String ans = "" + d.charAt(11) + d.charAt(12); // extract substring
        int a = Integer.parseInt(ans); // convert to integer
        return a > 60;
    }

    public int countSeniors(String[] details) {
        int ans = 0;
        for (int i = 0; i < details.length; i++) {
            if (c(details[i])) {
                ans += 1;
            }
        }
        return ans;
    }
}