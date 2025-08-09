import java.util.Scanner;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        double a=scn.nextDouble();
        double b=scn.nextDouble();
        char c=scn.next().charAt(0);
        double d=0;
        if (c=='+')d=a+b;
        else if(c=='-')d=a - b;
        else if(c=='*')d=a * b;
        else if(c=='/'){
            if(b==0) {
       System.out.println("Cannot divide by zero");
                scn.close();
                return;
            }
            d=a/b;
        } else {
            System.out.println("Invalid operation");
            scn.close();
            return;
        }
        System.out.println(d);
        scn.close();
    }
}
