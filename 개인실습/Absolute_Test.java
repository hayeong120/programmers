import java.util.Scanner;

class Absolute_Test
{
	public static void main(String args[])
	{
		int a, absolute;
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		a = sc.nextInt();

		absolute = a > 0 ? a : a*(-1);
		System.out.println(a + "의 절대값은 " + absolute + "입니다.");
	
	}
}