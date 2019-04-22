import java.util.Scanner;;

public class test2 {
	public void muti(int n)
	{
		for(int i=2;i*i<=n;i++)
		{
			while(n%i==0)
			{
				n/=i;
				System.out.print(i+"*");
			}
		}
		
		if(n!=1)
		{
			System.out.print(n);
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		test2 test=new test2();
		test.muti(n);
		sc.close();
	}
}
