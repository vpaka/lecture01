package lecture01;
import java.util.Scanner;
public class Lecture01
{
    public static void main(String[] args)
    {
        System.out.println("Hello Class!");
        System.out.print("This is my ");
        System.out.println("First java");
        System.out.println("program");
        System.out.print("Hello\tClass!");
        System.out.print("this\tis\na new line\n");

        System.out.println("4000"+3000); //concatenation
        System.out.println(4000+3000);//addition
        System.out.println('5'+3000);//addition of ascii value and integer
        System.out.println(4000-3000);//Sub
        System.out.println(4*3);//product
        System.out.println(10/5);//division
        System.out.println(4%3);//Modules
        //declaration
        int jhsdfhv;
        int b;
        String a;

        a="Class";
        a="Hello";
        //initialization
        jhsdfhv=500; b=100;
        jhsdfhv=514;
        System.out.println("The value of a is:\t"+a);
        System.out.println("The value of b is:\t"+b);
        System.out.println("The sum of\t"+ jhsdfhv+" and\t"+b+" is\t"+(jhsdfhv+b));


        //byte 2 digits

        //python input statement   a=input("")

        //Object creation syntax
        // ClassName obj=new ClassName();
        //Scanner object creation
        Scanner s=new Scanner(System.in);

        System.out.println("Enter a integer number");
        int value1=s.nextInt();
        System.out.println("The first value was : "+value1);


        System.out.println("Enter a integer number");
        int value2=s.nextInt();
        System.out.println("The second value was : "+value2);
        System.out.println("The sum of\t"+ value1+" and\t"+value2+" is\t"+(value1+value2));

        double value3;
        System.out.println("Enter a double value");
        value3=s.nextDouble();
        System.out.println("The third value was : "+value3);

        String value4;
        System.out.println("Enter a double value");
        value4=s.next();
        System.out.println("The third value was : "+value4);








    }
}
