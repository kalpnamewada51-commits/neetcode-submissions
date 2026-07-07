class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
 
        
        Map<String, List<String>>anagramMap = new HashMap<>();
        for(int i = 0;i<strs.length;i++)
        {
            int []result = anagramCount(strs[i]);
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<26;j++)
            {
             sb.append(result[j]);
             sb.append("#");

            }
            String key = sb.toString();
            List<String>list = anagramMap.getOrDefault(key,new ArrayList<>());
            list.add(strs[i]);
            anagramMap.put(key,list);
        }
        List<List<String>> result = new ArrayList<>(anagramMap.values());
        return result;
    }    

    public static int [] anagramCount(String str)
    {
        int result[] = new int[26];
        for(int i =0;i<str.length();i++)
        {
            result[str.charAt(i) -'a']++;
        }
        return result;
    }
        
}

