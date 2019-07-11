
public class EvenFirst {

    public static void evenFirst(int[] inputArray){

        int start=0, end=inputArray.length-1;
        while(start<end){
            if(inputArray[start]%2 != 0){
                int temp = inputArray[start];
                inputArray[start] = inputArray[end];
                inputArray[end] = temp;
                end--;
            }
            else {
                start++;
            }
        }
        for (int i=0; i<inputArray.length;i++){
            System.out.println(inputArray[i]);
        }
    }

    public static void main(String args[]){

        int[] inputArray = {1,2,3,4,5,6,7,8,9};
        EvenFirst.evenFirst(inputArray);
    }
}
