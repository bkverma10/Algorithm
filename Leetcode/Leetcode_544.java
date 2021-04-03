import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_544 {
    public String findContestMatch(int n) {
        String outerLeft = ""; // k-1
        String outerRight = "";
        String innerLeft = ""; // k-2
        String innerRight = "";
        int k = (int) (Math.log(n)/Math.log(2));

        List<String> team = new ArrayList<>();

        int end = n;
        for(int i =1; i<=n;i++){
            String singleTeam = ""+i;
            team.add(singleTeam);
            //System.out.println(team.get(i-1));
        }
        while(team.size()!=1){
            List<String> newRound = new ArrayList<>();
            for(int i=0;i<team.size()/2;i++) {
                newRound.add("(" + team.get(i) + "," + team.get(team.size()-1-i) + ")");
                System.out.println(newRound.get(i));
            }
            team = newRound;

        }

        /*for(String str : team){
            System.out.println(str);
        }*/


       /* for(int i = 0; i<k-1;i++){
            outerLeft += "(";
            outerRight += ")";
        }
        for(int i = 0; i<k-2;i++){
            innerLeft += "(";
            innerRight += ")";
        }*/

        //System.out.println("  " + outerLeft + " , " + innerRight + " " + innerLeft + " , " + outerRight );
        //System.out.println("  " +  + " " + );
        return "";
    }







        public String freqAlphabets(String s) {

            Map<String,String> map = new HashMap<>();
            String output="";
            for(int i =1;i<=26;i++){
                String key = ""+i;
                String val = getCharForNumber(i);
                map.put(key,val);
                //System.out.println(key +" - "+ map.get(key));
            }

            for(int i=s.length()-1;i>=0;i--){
                if(s.charAt(i)=='#'){
                    String key = s.charAt(i-2) +""+ s.charAt(i-1);
                    output = map.get(key) + output;
                    System.out.println(" key "+key + " val " + map.get(key));
                    i=i-2;
                }
                else {
                    String key1 = ""+s.charAt(i);
                    output = map.get(key1) + output;
                }
            }
            System.out.println(output);
            return "";
        }

        private String getCharForNumber(int i) {

            return i > 0 && i < 27 ? String.valueOf((char)(i + 96)) : null;
        }

        public int minInsertions(String s) {
            int start = 0;
            int end = s.length()-1;
            int count =0;
            while(start<end){
                if(s.charAt(start)!=s.charAt(end)){
                    count ++;
                }
                start++;
                end--;
            }
        return count;
        }
    public static void main(String[] args){
        Leetcode_544 obj = new Leetcode_544();
        int n = 8;
        //System.out.println(obj.findContestMatch(n));
        String input = "mbadm";
        //System.out.println(obj.freqAlphabets(input));
        System.out.println(obj.minInsertions(input));
    }

}
