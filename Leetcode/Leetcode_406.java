import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Leetcode_406 {

        public int[][] reconstructQueue(int[][] people) {
            Arrays.sort(people, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    // if the heights are equal, compare k-values
                    return o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0];
                }
            });


            for(int[] i:people){
                System.out.println("[" + i[0] + "," + i[1] + "]" );

            }
            System.out.println("");
            List<int[]> output = new ArrayList<>();
            for(int[] p : people){
                output.add(p[1], p);
            }

            int n = people.length;
            return output.toArray(new int[n][2]);
        }

    public static void main(String[] args){
        Leetcode_406 obj = new Leetcode_406();
            int[][] input = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};


            for(int[] i:obj.reconstructQueue(input)){
                System.out.println("[" + i[0] + "," + i[1] + "]" );

            }

    }
}
