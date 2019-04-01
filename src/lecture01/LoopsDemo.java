package lecture01;

public class LoopsDemo {
    public static void main(String[] args)
    {
        int i=0;
        System.out.println(i++);
        System.out.println("i is "+i);
        System.out.println(i--);
        System.out.println("i is "+i);
        System.out.println(++i);
        System.out.println("i is "+i);
        i=0;
        System.out.println(--i);
        System.out.println("i is "+i);

        for(int a=0; a<=5; a++)
        {
            System.out.println("value of a is "+a);
        }

        int j=0;
        while(j<5)
        {
            ++j;
            System.out.println("J is :"+j);

        }



        /*
        initialization;
        do
        {


        inc/dec
        }while(condition);

        */
        int z=10;
        do {
            System.out.println("value of Z is: "+z);
            z++;

        }while(z<5);

    }
}
