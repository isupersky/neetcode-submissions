class Solution {
    public boolean isPalindrome(String s) {
        int len= s.length();
        String ss = s.toLowerCase();

        int i = 0;
        int j = len-1;

        while(j>i){
            if(!Character.isLetterOrDigit(ss.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(ss.charAt(j))){
                j--;
                continue;
            }
            if(ss.charAt(i) != ss.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
