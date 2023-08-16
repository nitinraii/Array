import java.util.*;

public class arrays{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("The marks of maths are: " + marks[0]);
        System.out.println("The marks of physics are: " + marks[1]);
        System.out.println("The marks of chemistry are: " + marks[2]);
        marks[1] = marks[1] -7;
        System.out.println("The marks of physics are: " + marks[1]);
        System.out.println("The length of an array is: " + marks.length);
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("The percentage is " + percentage);


        
    }
}