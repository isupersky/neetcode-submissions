class Solution {

    public String encode(List<String> strs) {
        StringBuffer sb = new StringBuffer();
        for (String s : strs){
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList();
        if(str == ""){
            return list;
        }
        for(int i =0;i<str.length();){
            int j=i;
            while (str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            j++;
            String word = str.substring(j,j+length);
            list.add(word);
            i = j+length;
        }
        return list;
    }
}
