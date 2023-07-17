import java.util.Scanner;

class ForTest12
{
	public static void main(String args[])
	{
		int row, column;
		Scanner sc = new Scanner(System.in);

		System.out.print("행을 입력하세요 : ");
		row = sc.nextInt();
		System.out.print("열을 입력하세요 : ");
		column = sc.nextInt();

		for (int i=1; i<=row; i++)
		{
			for (int j=i; j<=(i*column); j += i)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}