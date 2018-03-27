import java.util.Scanner;
public class KIntegers
{
	public static void main(String[] args) {
	 Scanner S = new Scanner(System.in);
	 System.out.println("Enter the number of N and K");
	 int N = S.nextInt();
	 int K = S.nextInt();
	 int sum = 0;
	 for(int i=1; i<=N; i++)
	 System.out.println(i);
	 for(int j=0; j<=K; j++)
	 sum+=j;
	 
	 System.out.println(sum);
	}
}
