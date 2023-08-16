public class bruteforce{
    public static void maxsumArray(int numbers[]){
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<numbers.length;i++){
            int start = i;
            currsum = 0;
            for(int j = i;j<numbers.length;j++){
                int end = j;
                 for(int k = start ;k<=end;k++){
                currsum += numbers[k];

            }
            }
           
            System.out.println(currsum);
            if(maxSum < currsum){
                maxSum = currsum;

            }
        }
        System.out.print("The max sum of all " + maxSum);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        maxsumArray(numbers);
    }
}