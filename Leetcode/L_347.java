import java.util.*;

public class L_347
{
    public List<Integer> topKFrequent(int[] nums, int k){
        List<Integer> res = new ArrayList<>();

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        Map<Integer,Integer> map = new HashMap<>();

        for(Integer n: nums){
            map.put(n, map.getOrDefault(n, 0 ) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.add(entry);
        }

        while(res.size() < k){
            Map.Entry<Integer,Integer> entry = pq.poll();
            res.add(entry.getKey());
        }
        return res;
    }
    public static void main(String[] args){
        L_347 obj = new L_347();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        for(int i: obj.topKFrequent(nums,k)){
            System.out.println(i);
        }

    }
}
