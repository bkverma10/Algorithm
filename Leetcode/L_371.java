

public class L_371 {
    int getSum(int a, int b) {
        if(b==0){
            return a;
        }
        return getSum(a^b, (a&b)<<1);
        //return b==0? a:getSum(a^b, (a&b)<<1); //be careful about the terminating condition;
    }

    public static void main(String[] args){
        L_371 obj = new L_371();
        System.out.println(obj.getSum(2,3));
    }
}
