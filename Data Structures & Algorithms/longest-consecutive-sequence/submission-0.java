class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int num: nums){
            set.add(num);
        }

        int response = 0;
        int max=1;
        for(int i=0; i<nums.length; i++){
            int num =nums[i];
            while(set.contains(num+1)){
                max++;
                num++;
            }
            if(max>response) {
                response = max;}
            max =1;
        }
        return response;
    }
}
