public class palindrome{
    public static void main(String args[]){
        int no =2002;
        int temp = no;
        int rev =0;
        int rem;
        while(temp!=0){
            rem = temp%10;
            rev = (rev*10) + rem;
            temp /=10;
        }
        if(no==rev){
            System.out.println("the number is palindrome");
        }
        else{
            System.out.println("it is not");
        }


    }
    
}