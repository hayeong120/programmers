import java.util.Scanner;

class Str
{
	public static void main(String args[])
	{
		String str1, str2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요: ");
		str1 = sc.next();
		System.out.print("문자를 입력하세요: ");
		str2 = sc.next();

		System.out.println(str2 + " " +str1);
	}
} 