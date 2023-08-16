public class LargestandSmallest{
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<numbers.length;i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static int getsmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i =0;i<numbers.length;i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int numbers[] = {5,89,76,54,21};
        System.out.println(getLargest(numbers));
        System.out.println(getsmallest(numbers));
    }
}