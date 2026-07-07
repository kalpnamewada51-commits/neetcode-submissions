class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();
        for(int i =0;i<strs.size();i++)
        {
            sb.append(strs.get(i).length());
            sb.append("#");
            sb.append(strs.get(i));
        }
        String encode_str = sb.toString();
        return encode_str;
    }
    public List<String> decode(String str) {
    List<String> decoded_list = new ArrayList<>();
    int i =0;
    while(i<str.length())
    {
        int j = str.indexOf('#', i);
        String lengthStr = str.substring(i, j);
        int length = Integer.parseInt(lengthStr);
String word = str.substring(j+1, j+1+length);
decoded_list.add(word);
i = j+1+length;
    }
    return decoded_list;

    }
}
