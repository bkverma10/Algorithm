import java.util.ArrayList;
import java.util.List;

public class Increment {

    private void incrementOne(List<Integer> num)
    {
        int rem = 1;
        ArrayList<Integer> res = new ArrayList();
        for(int i=num.size() - 1; i>= 0; --i)
        {
            int d = num.get(i) + rem;
            rem = d/10;
            d = d%10;

            res.add(0,d);
            //System.out.println(d);

        }
        if(rem > 0)
        {
            res.add(0,rem);
        }

        for(int i : res)
        {
            System.out.println(i);
        }

    }

    public static void main(String[] args)
    {
        /**
         * input : 129
         * output: 130
         */
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(9);
        input.add(9);
        Increment obj = new Increment();
        obj.incrementOne(input);

    }
}
