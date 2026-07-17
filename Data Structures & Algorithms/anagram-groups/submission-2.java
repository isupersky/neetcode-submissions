class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap();
        for(String str: strs){
            int[] alpha = new int [26];
            //char[] chars = str.toCharArray();
            for(int i =0; i< str.length();i++){
                alpha[str.charAt(i)-'a']++;
            }
            String a = Arrays.toString(alpha);
            map.putIfAbsent(a, new ArrayList());
            map.get(a).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
