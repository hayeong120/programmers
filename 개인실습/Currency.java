import java.util.Scanner;

class Currency
{
	public static void main(String args[])
	{
		int money;
		int m50000 = 0, m10000 = 0, m5000 = 0, m1000 = 0,
		    m500 = 0, m100 = 0, m50 = 0, m10 = 0, m5 = 0, m1 =0;
		Scanner sc = new Scanner(System.in);

		System.out.print("금액을 입력하시오 >> ");
		money = sc.nextInt();

		m50000 = money / 50000;
		m10000 = (money % 50000) / 10000;
		m5000 = ((money % 50000) % 10000) / 5000;
		m1000 = (((money % 50000) % 10000) % 5000) / 1000;
		m500 = ((((money % 50000) % 10000) % 5000) % 1000) / 500;
		m100 = (((((money % 50000) % 10000) % 5000) % 1000) % 500) / 100;
		m50 = ((((((money % 50000) % 10000) % 5000) % 1000) % 500) % 100) / 50;
		m10 = (((((((money % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10;
		m5 = ((((((((money % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) % 10) / 5;
		m1 = (((((((((money % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) % 10) % 5) / 1;

		System.out.println("오만원권 " + m50000 + "매");
		System.out.println("만원권 " + m10000 + "매");
		System.out.println("오천원권 " + m5000 + "매");
		System.out.println("천원권 " + m1000 + "매");
		System.out.println("오백원권 " + m500 + "매");
		System.out.println("백원권 " + m100 + "매");
		System.out.println("오십원권 " + m50 + "매");
		System.out.println("십원권 " + m10 + "매");
		System.out.println("오원권 " + m5 + "매");
		System.out.println("일원권 " + m1 + "매");


	}
}