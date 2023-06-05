import java.util.Scanner;

class ForTest6
{
	public static void main(String args[])
	{
		int n1, n2, count = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 10개를 입력하세요:");
		n1 = sc.nextInt(); n2 = sc.nextInt();
		n3 = sc.nextInt(); n4 = sc.nextInt(); 
		n5 = sc.nextInt(); n6 = sc.nextInt();
		n7 = sc.nextInt(); n8 = sc.nextInt();
		n9 = sc.nextInt(); n10 = sc.nextInt();

		

		for(int i=0; i<11; i++)
 		{
			if(n1%3 == 0 || n1%5 == 0)
				count = count + 1;
			if(n2%3 == 0 || n2%5 == 0)
				count = count + 1;
			
		}
		
		System.out.println("3또는 5의 배수의 개수 : " + count);
	}
}