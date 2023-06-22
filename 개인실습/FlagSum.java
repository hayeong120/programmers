import java.util.Scanner;

class FlagSum
{
	public static void main(String args[])
	{
		int n, sum = 1;
		Scanner sc = new Scanner(System.in);

		System.out.print("n을 입력해주세요 : ");
		n = sc.nextInt();

		System.out.print("1");

		for(int i=2; i<=n; i++)
		{
			if(i % 2 == 0)
			{
				sum = sum - i;
				System.out.print(" - " + i);
			}
			else
			{
				sum = sum + i;
				System.out.print(" + " + i);
			}
		}

		System.out.println(" = " + sum);
	}
}