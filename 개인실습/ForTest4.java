import java.util.Scanner;

class ForTest4
{
	public static void main(String args[])
	{
		int i, a;
		Scanner sc = new Scanner(System.in);

		System.out.print("10이하의 정수를 입력하세요 : ");
		i = sc.nextInt();

		if(i<=10)
		{
			for(a=0; a<i; a++)
			{
				System.out.println("MSG");
			}
		} 
		else
		{
			System.out.println("해당 범위에 값이 들어있지 않습니다.");
		}
	}
}