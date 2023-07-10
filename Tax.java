import java.util.Scanner;
class Tax
{
    public static void main(String [] args) 
    {
        System.out.println("enter monthly salary");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int ctc=12 * x;
        if ( ctc > 1000000)
        {
            int z1=ctc-1000000;
            double t1=(z1*0.3)+(500000*0.2)+(250000*0.1);
            System.out.println(t1);
        }
        else if (ctc > 500000 && ctc<=1000000)
        {

            int z2=ctc-500000;
            double t2=(z2*0.2)+(250000*0.1);
            System.out.println(t2);
        }
        else if (ctc > 250000 && ctc<= 500000)
        {

            int z3=ctc-250000;
            double t3=(z3*0.1);
            System.out.println(t3);
        }
        else
        {
            double t4=0;
            System.out.println(t4);
        }


    }
}


 

        