package lecture01;
import java.util.Scanner;
public class Lecture02 {
    public static void main(String[] args)
    {

        System.out.println("Enter a number");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num>0)
        {
            System.out.println(num+" is a positive number");
        }
        else if(num<0)
        {
            System.out.println(num+" is a negative number ");
        }
        else
            {
            System.out.println(num+" is a equal to zero ");
        }
    }

}
