//java program to ddition,subtraction,multiplication and division two number
import java.util.Scanner;

/**
 *
 * @author biradar bharat
 */
public class Calculate
{
    public static void main(String[] args) 
    {
        int m, n, opt, add, sub, mul;
        double div;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number:");
        m = s.nextInt();
        System.out.print("Enter second number:");
        n = s.nextInt();
        while(true)
        {
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 5 to Exit");
            opt = s.nextInt();
            switch(opt)
            {
                //Addition
                case 1:
                add = m + n;
                System.out.println("Result:"+add);
                break;
                //multiplication
                case 2:
                sub = m - n;
                System.out.println("Result:"+sub);
                break;
                //Multiplication
                case 3:
                mul = m * n;
                System.out.println("Result:"+mul);
                break;
                //Division 
                case 4:
                div = (double)m / n;
                System.out.println("Result:"+div);
                break;    
                //Exit 
                case 5:
                System.exit(0);
            }
        }
    }
}
