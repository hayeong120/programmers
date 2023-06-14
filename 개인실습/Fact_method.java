import java.util.Scanner;

class Fact_method
{
	public static void main(String args[])
	{
		int n, result = 1;
		Scanner sc = new Scanner(System.in);

		System.out.print("n을 입력해주세요 : ");
		n = sc.nextInt();

		for(int i=1; i<=n; i++)
		{
			result = result * i;
		}

		System.out.println(n + "! = " + result);
	}
}