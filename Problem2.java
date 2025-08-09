import java.util.Scanner;

public class problem2 {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter number");
	int n=scn.nextInt();
	for(int i=1;i<=n;i++)
	{
	System.out.print(2*i-1);
		if(i<n)
	{
		System.out.print(",");
	}
	
	}
	scn.close();
	
}
}
