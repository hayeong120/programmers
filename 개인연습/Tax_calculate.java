import java.util.Scanner;

class Tax_calculate 
{
	public static void main(String[] args) 
	{
		double tax, salary;
		tax = 0;
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

		System.out.println(tax);
	}
}
