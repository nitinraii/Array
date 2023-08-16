public class arraysFunction{
    public static void update(int marks[]){
        for(int i = 0;i<marks.length;i++){
            marks[i] = marks[i] + 1; 
            //Arrays perform call by reference and it is basically take value from update function to main function 
            //but in java other integer or float or other data types dont
        }
    }
    public static void main(String args[]){
        int marks[] ={96,97,98};
        update(marks);
         for(int i = 0;i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }
        
    }
}