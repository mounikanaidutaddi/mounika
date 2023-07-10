import java.util.Scanner;
class Ebill
{
    public static int calculateBill(int u) {
      Scanner sc= new Scanner(System.in);
        System.out.println("Select the CDI category:");
        System.out.println("1. Commercial");
        System.out.println("2. Domestic");
        System.out.println("Industrial");
        System.out.println("Enter your choice");
        int category=sc.nextInt();

 

        switch(category)
        {
            case 1:
                if(u<=100)
                    return u*2;
                else if(u<=200)
                    return (100*2)+(u-100)*4;
                else 
                    return (100*2)+(100*4)+(u-200)*6;
            //break;
           case 2:
                if(u<=100)
                    return u*1;
                else if(u<=200)
                    return (100*1)+(u-100)*2;
                else 
                    return (100*1)+(100*2)+(u-200)*3;
                //break;
           case 3:
                if(u<=100)
                    return u*3;
                else if(u<=200)
                    return (100*3)+(u-100)*6;
                else 
                    return (100*3)+(100*6)+(u-200)*9;
                //break;
           default :
            System.out.println("Invalid");

 

        }
        return 0;

 

    }
    public static void main(String args[])
    {

 

        int u=500;
        System.out.println("calculateBill"+calculateBill(u));
    }
}

 