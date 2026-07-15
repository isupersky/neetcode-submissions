class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> x = new HashSet();

        for(int num : nums){
            if(!(x.add(num))){
                return true;
            }
        }
        return false;
    }
}