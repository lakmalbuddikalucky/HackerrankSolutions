import java.util.Scanner;

public class PlusMinus{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		double[] arr = new double[3];
		
		for(int x=0;x<N;x++){
			double num = in.nextDouble();
			if(num>0) arr[0]+=1;
			else if(num<0) arr[2]+=1;
			else arr[1]+=1;
		}
		
		System.out.printf("%.3f",arr[0]/N);
		System.out.println();
		System.out.printf("%.3f",arr[2]/N);
		System.out.println();
		System.out.printf("%.3f",arr[1]/N);
	}
}
