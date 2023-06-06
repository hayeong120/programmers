import java.util.Scanner;

class ForTest6
{
	public static void main(String args[])
	{
		int n, count = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 10개를 입력하세요:");

		for(int i=0; i<10; i++)
 		{
			n = sc.nextInt();

			if(n % 3 == 0 || n % 5 == 0)
			{
				count = count + 1;
			}
		}
		
		System.out.println("3 또는 5의 배수의 개수 : " + count);
	}
}