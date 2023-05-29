import java.util.Scanner;

class Salary_Switch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in, "EUC-KR");
		double currentSalary, newSalary, raise;	//현 연봉, 새 연봉, 연봉 인상액
		String rating;		//근무 평가등급

		System.out.print("현 연봉을 입력하세요 : ");
		currentSalary = sc.nextDouble();		

		System.out.print("근무평가등급을 입력하세요 : ");
		rating = sc.next();
		
		switch(rating)
		{
			case "우수":
				raise = currentSalary*0.06;
				System.out.println("연봉인상액 : " + (int)raise);
       			newSalary = currentSalary + raise;
				System.out.println("새 연봉인상액 : " + (int)newSalary);
				break;

			case "보통":
				raise = currentSalary*0.04;
				System.out.println("연봉인상액 : " + (int)raise);
       			newSalary = currentSalary + raise;
				System.out.println("새 연봉인상액 : " + (int)newSalary);
				break;

			case "불량":
				raise = currentSalary*0.02;
				System.out.println("연봉인상액 : " + (int)raise);
       			newSalary = currentSalary + raise;
				System.out.println("새 연봉인상액 : " + (int)newSalary);
				break;
		}
			
	}
}