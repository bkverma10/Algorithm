import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DutchFlag {
    public List<Integer> arrange(ArrayList<Integer> input, int pivotIndex){
        int pivote = input.get(pivotIndex);
        int smaller = 0, equal = 0, larger = input.size()-1;
        while(equal < larger){
            if(input.get(equal) < pivote){
                Collections.swap(input, smaller++, equal++);
            }
            else if(input.get(equal) == pivote){
                equal++;
            }
            else {
                Collections.swap(input, equal, --larger);
            }
        }
        return input;
    }


    public static void main(String[] args){
        ArrayList<Integer> input = new ArrayList<>();
        input.add(0);
        input.add(1);
        input.add(2);
        input.add(0);
        input.add(2);
        input.add(1);
        DutchFlag obj = new DutchFlag();
        for(int i: obj.arrange(input,3)){
            System.out.println(i);
        }
    }
}
