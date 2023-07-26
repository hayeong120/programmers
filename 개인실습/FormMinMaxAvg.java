import java.util.Scanner;

class FormMinMaxAvg
{
	public static void main(String[] args) 
	{
		int c;
		double max, min, gap; 
		Scanner sc = new Scanner(System.in);
				
		System.out.println("******************************");
		System.out.println("*           반 평균          *");
		System.out.println("******************************");
		
		while (true)
		{
			System.out.print("입력받을 반의 개수 (2~4) ==> ");
			c = sc.nextInt();
			System.out.println();

			if ( c<=4 && c>=2 )
			{
			  System.out.println("[ 총 " + c + "개의 반이 존재합니다. ]");
			  System.out.println();
			  break;
			}
			else 
			  System.out.println("[ 입력 가능한 반은 2~4반입니다. 다시 입력해주세요. ]");
		}		// while

		int[] point = new int[c*2];		// 배열 선언과 생성

		for (int i=0; i<c*2; i++)
		{
			System.out.print("[" + (i+1) + "] " + (i%c+1) + "반 학생 점수 입력 (0~100) ==> ");
			point[i] = sc.nextInt();
			System.out.println();

			while ( point[i]<0 || point[i]>100 )
			{
		  		  System.out.println("[ 잘못된 범위의 점수가 입력되었습니다. 다시 입력해주세요. ]");
				  System.out.print("[" + (i+1) + "] " + (i%c+1) + "반 학생 점수 입력 (0~100) ==> ");
				  point[i] = sc.nextInt();
				  System.out.println(); 
			}  		// while
		}		// for
		
		double[] avg = new double[c];		// 배열 선언과 생성
		
		for (int i=0; i<c; i++)
		{
			avg[i] = (double)(point[i]+point[i+c])/2;	
		}	
		
		max = avg[0]; 
		min = avg[0];
		int cmax=0, cmin=0;
		for (int i=1; i<c; i++)
		{
			if (max >= avg[i])
			  max = max;
			else
			{
			  max = avg[i];
			  cmax = i;
			}

			if (min < avg[i])
			  min = min;
			else
			{			
  			  min = avg[i];
			  cmin = i;
			} 
		}

		gap = max - min;

		System.out.printf("[ 제일 잘한 반은 %d반이며, %d반의 평균 점수는 %.2f점으로, 제일 점수가 낮은 %d반의 평균인 %.2f점보다 %.2f점 높습니다. ]", cmax+1, cmax+1, max, cmin+1, min, gap);

	}
}









