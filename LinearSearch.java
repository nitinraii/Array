public class LinearSearch{
    public static int linearsearch(int numbers[],int key){
        for(int i = 0; i<numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,20,12};
        int key =8;
        int index = linearsearch(numbers,key);
        if(index == -1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println(index);
        }
    }
}