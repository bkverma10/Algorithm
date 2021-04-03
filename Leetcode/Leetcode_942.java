public class Leetcode_942 {


        public int[] diStringMatch(String S) {
            int N = S.length();
            int[] output = new int[N+1];
            int i = 0;
            int d = N;
            for(int j=0; j<N; j++){
                if(S.charAt(j) == 'I'){
                    output[j] = i++;
                }
                else {
                    output[j] = d--;
                }
            }
            output[N] = S.charAt(N-1) == 'I' ? i:d;

            return output;
    }
    public static void main(String[] args){
        Leetcode_942 obj = new Leetcode_942();
        for(int i:obj.diStringMatch("IDID")){
            System.out.println(i);
        }
    }
}
