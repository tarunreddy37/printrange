import java.util.*;
class printrange
{
public static void main(String args[])
{
	int n,m;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n value:");
	n=sc.nextInt();
	System.out.println("enter m value:");
	m=sc.nextInt();
	while(m>=n)
	{
		if(m%2==0)
		System.out.print(" "+m);
		m--;
	}
}
}