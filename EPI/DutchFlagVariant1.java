import java.util.*;

public class DutchFlagVariant1 {
        public int[] variant1(int[] num, int k){
            //List list = Arrays.asList(num);

            int start = 0;
            for(int i=1; i < num.length;i++) {
                if (num[i] == k) {
                    //swap(num, start, i);
                    int temp = num[start];
                    num[start] = num[i];
                    num[i] = temp;
                    i--;
                    start++;
                }

            }
            return num;
        }

        public int[] variant2(int[] num, int k){
        //List list = Arrays.asList(num);

        /*int start = 0;
        int i = 0;
        while(i<num.length){
            if (num[i] != k) {
                //swap(num, start, i);
                int temp = num[start];
                num[start] = num[i];
                num[i] = temp;
                start++;
                i++;
                continue;
            }
            i++;
        }*/
            int start = num.length-1;
            int i = num.length-1;
            while(i>=0){
                if (num[i] != k) {
                    //swap(num, start, i);
                    int temp = num[start];
                    num[start] = num[i];
                    num[i] = temp;
                    start--;
                    i--;
                    continue;
                }
                i--;
            }
        return num;
    }

        private void swap(int[] num, int start, int curr){
            int temp = num[start];
            num[start] = num[curr];
            num[curr] = temp;
            PriorityQueue<Integer> pq = new PriorityQueue<>();

        }

    public static void main(String[] args){
        int[] num = {1,2,3,4,2,5}; // output = {2,2,1,3,1,3}
        DutchFlagVariant1 obj = new DutchFlagVariant1();

        for(int i: obj.variant2(num,2)){
            System.out.println(i);
        }

    }
}
