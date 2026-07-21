class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int arrLen = nums.length;
        Map<Integer,Integer> map = new HashMap();
        for(int i = 0; i< arrLen;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        Queue<Integer> q = new PriorityQueue(Comparator.comparingInt(map::get));
        for(int key : map.keySet()){
           q.add(key);
           if(q.size()>k){
            q.poll();
           }
        }

        int[] res = new int[k];
        for (int i = 0; i<k ;i++){
            res[i] = q.poll();
        }

       return res;
    }
}
