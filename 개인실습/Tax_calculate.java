import java.util.Scanner;

class Tax_calculate 
{
	public static void main(String[] args) 
	{
		double salary, tax = 0;

		System.out.print("연간 근로소득 : ");

		Scanner scan = new Scanner(System.in);
		salary = scan.nextDouble();

		if (salary<=20000000) {
			tax = salary*0.05;
		} else if (salary<=40000000) {
			tax = salary*0.15;
		} else if (salary<=80000000) {
			tax = salary*0.25;
		} else if (salary>80000000) {
			tax = salary*0.4;
		}

		System.out.println("소득세 : " + tax);
	}
}