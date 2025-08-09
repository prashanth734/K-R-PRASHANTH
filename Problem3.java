import java.util.Scanner;
public class OddSeries {
    public static void main(String[] args) {
    	Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       int count;
       if(n%2==0)
       {
    	   count=n-1;
       }
       else
       {
    	   count=n;
       }
       
    for(int i=0;i<count;i++)
    {
    	System.out.print(2* i+1);
    	if(i!=count-1)
    	{
    		System.out.print(", ");
    	}
    }
    scn.close();
    }
}
