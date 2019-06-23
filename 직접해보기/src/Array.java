import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[][]  = new int[4][4];	//		int[i][j] = s.nextInt();  이중배열을 선언하였다.
		System.out.println("배열에 숫자를 입력하십시오.");
		for (int i = 0;i<arr[i].length-1; i++) {
			for(int j = 0;j<arr[j].length-1;j++) {
				arr[i][j] = s.nextInt();
				arr[i][3] += arr[i][j]; 
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[i][j];
			}
		}
		 for(int i=0;i<4;i++) {
			  for(int j=0;j<4;j++) {
			    System.out.print(arr[i][j] + " ");
			   }
			   System.out.println("");
			  }
	}	
}
				
				
				
//				arr[0][3] = arr[0][0] + arr[0][1] + arr[0][2];
//				arr[1][3] = arr[1][0] + arr[1][1] + arr[1][2];
//				arr[2][3] = arr[2][0] + arr[2][1] + arr[2][2];
				
				// arr[i][3] = arr[i][0] + arr[i][1] + arr[i][2];
						
				
//				arr[3][0] = arr[0][0] + arr[1][0] + arr[2][0];
//				arr[3][1] = arr[0][1] + arr[1][1] + arr[2][1];
//				arr[3][2] = arr[0][2] + arr[1][2] + arr[2][2];

//	 			arr[3][j] = arr[0][j] + arr[1][j] + arr[2][j];
				
