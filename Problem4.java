import java.util.HashMap;
import java.util.Map;

public class Problem4 {
public static void main(String[] args) {
	int a[]= {1,2,8,9,12,46,76,82,15,20,30};
	int count;
	Map<Integer,Integer> map=new HashMap<>();
	for(int i=1;i<=9;i++)
	{
	count=0;
	for(int n:a)
	{
	if(n%i==0)
	{
		count++;
	}
	}
	map.put(i,count);
	}
	System.out.println(map);
}
}
