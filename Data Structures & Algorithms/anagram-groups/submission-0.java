class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap();
        for(String str: strs){
            int[] alpha = new int [26];
            char[] chars = str.toCharArray();
            for(char c : chars){
                alpha[c-'a']++;
            }

            map.putIfAbsent(Arrays.toString(alpha), new ArrayList());
            map.get(Arrays.toString(alpha)).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
