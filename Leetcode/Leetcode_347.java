import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_347 {
    private List<Integer> kthMaxElement(int[] arr){
        List<Integer> res = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        map.forEach((k,v)-> System.out.println(k + " " + v));
        map.entrySet().stream().sorted((k1, k2) -> k2.getValue().compareTo(k1.getValue())).forEach(k -> res.add(k.getKey()));
        int k =2;
        for(int i=0;i<k;i++){
        output.add(res.get(i));
        }
        return output;
    }

    public static void main(String[] args){
        Leetcode_347 obj = new Leetcode_347();
        int[] input={1,1,1,2,2,3,3,3,3};
        for(int i: obj.kthMaxElement(input))
        {
            System.out.println(i);
        }

    }
}
