package Day1;
import java.util.Scanner;
public class twod_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter row");
		int row=sc.nextInt();
		System.out.print("enter col");
		int col=sc.nextInt();
		int [][]arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("the output");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
