class DNFPSolution{
    public void dutchNationalFlagProblem(int input[], int index){
        int smaller=0, equal=0, larger=input.length-1;
        while(equal<larger){
            if(input[equal]<input[index]){
                //swap(input,smaller++,equal++);
                int temp = input[smaller];
                input[smaller] = input[equal];
                input[equal] = temp;
                smaller++;
                equal++;
            }
            else if(input[equal]==input[index]){
                ++equal;
            }
            else { //input[equal]>input[index]
                //swap(input,equal,--larger);
                int temp = input[equal];
                input[equal] = input[larger];
                input[larger] = temp;
                larger--;
            }
        }
        for (int i:input) {
            System.out.println(i);
        }

    }
    private void swap(int input[], int i, int j){
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
        return;
    }
}
public class DNFP {
    public static void main(String args[]){
        int input[]= {0,-1,0,5,7,1,1,2,3,4,9,10,6,8};
        int index = 4;
        DNFPSolution obj = new DNFPSolution();
        obj.dutchNationalFlagProblem(input,index);
    }

}
