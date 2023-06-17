import java.util.Scanner;

class Prime
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.print("n을 입력해주세요 : ");
		n = sc.nextInt();

		for(int i=1; i<=n; i++)
		{
			if(n % i == 0)
			{
				System.out.println("n은 소수가 아닙니다.");
				break;
			}
			else
			{
				System.out.println("n은 소수입니다.");
				break;
			}
		}		

	}
}