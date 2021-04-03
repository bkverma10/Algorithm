import java.util.*;

public class L_692 {

    public List<String> topKFrequent(String[] words, int k) {
        List<String> res = new ArrayList<>();
        Map<String,Integer> map = new TreeMap<>();
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a,b) -> a.getValue() == b.getValue() ? a.getKey().compareTo(b.getKey()): b.getValue() - a.getValue());
        for(String s : words){
            map.put(s, map.getOrDefault(s,0) + 1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            pq.add(entry);
        }

        while(res.size() < k){
            Map.Entry<String, Integer> entry = pq.poll();
            res.add(entry.getKey());
        }
        return res;
    }

    public static void main(String[] args){
        L_692 obj = new L_692();
        String[] input = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        String[] input2 = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k2 = 4;
        String[] input3 = {"i", "love", "leetcode", "i", "love", "coding"};
        int k3 = 3;
        for(String s : obj.topKFrequent(input3,k3)){
            System.out.println(s);
        }


    }
}
