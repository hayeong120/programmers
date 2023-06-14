import java.util.Scanner;

class FlagSum
{
	public static void main(String args[])
	{
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("n을 입력해주세요 : ");
		n = sc.nextInt();

		for(int i=1; i<=n; i++)
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