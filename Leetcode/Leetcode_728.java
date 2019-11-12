import java.util.ArrayList;
import java.util.List;

public class Leetcode_728 {


    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> output = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            if (isDivisible(i)) {
                output.add(i);
            }
        }
        return output;
    }

    public boolean isDivisible(int i) {
        boolean ignore = false;
        int num = i;
        while (num > 0) {
            int remainder = num % 10;
            if (remainder == 0 || i % remainder != 0) {
                return false;
            }
            num = num / 10;
        }
        return true;
}

    public static void main(String[] args){
        Leetcode_728 obj = new Leetcode_728();

        for(int sdn:obj.selfDividingNumbers(110,115)){
            System.out.println(sdn);
        }
    }
}
