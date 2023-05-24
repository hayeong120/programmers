import java.util.Scanner;

class Salary_switch
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);

      String rating;
      double raise = 0.0;
      double currentSalary, newSalary;
      
      System.out.print("현 연봉을 입력하세요 : ");
      currentSalary = sc.nextDouble();
      System.out.print("근무평가등급을 입력하세요 : ");
      rating = sc.next();

      switch(rating) {
      case "우수" :
         raise = currentSalary*0.06; break;
      case "보통" : 
         raise = currentSalary*0.04; break;
      case "불량" : 
         raise = currentSalary*0.02; break;
      }

         System.out.println("연봉인상액 : " + (int)raise);
         newSalary = currentSalary + raise;
         System.out.println("새 연봉인상액 : " + (int)newSalary);
   }
}