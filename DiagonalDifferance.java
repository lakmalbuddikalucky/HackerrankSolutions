import java.util.Scanner;


public class DiagonalDifferance {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] matrix = new int[N][N];
		for(int y=0;y<N;y++){
			for(int x=0;x<N;x++){
				matrix[y][x] = in.nextInt();
			}
		}
		
		int x1=0,y1=0,x2=N-1,y2=0;
		int sum1=0,sum2=0;
		while(x1<=N-1 && y2<=N-1){
			sum1 += matrix[y1][x1];
			x1+=1;
			y1+=1;
			sum2+= matrix[y2][x2];
			y2+=1;
			x2-=1;
		}
		System.out.println(Math.abs(sum1-sum2));
	}
}
