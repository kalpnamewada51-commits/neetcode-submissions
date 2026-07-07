class Solution  {
    public int[] topKFrequent(int[] nums, int k) {

    int res[] = new int[k];
        Map<Integer,Integer>map = new HashMap<>();

        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
List<Map.Entry<Integer, Integer>> entries = 
new ArrayList<>(map.entrySet());
entries.sort((e1, e2) -> e2.getValue() - e1.getValue());

for(int i=0;i<k;i++)
{
    res[i]=entries.get(i).getKey();
}
return res;


                
    }
}
