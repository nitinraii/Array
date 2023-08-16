public class kadanealgo{
    public static void kadane(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0;i<numbers.length;i++){
            cs = cs + numbers[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("The max sum of an array "+ ms);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,7,9};
        kadane(numbers);
    }
}