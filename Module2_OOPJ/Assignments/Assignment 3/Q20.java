/* 20. Sum of Two Matrix 

Given two matrices of the same size, compute their sum. */

public class Q20{
	public static void main(String args[]){
		int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] matrix2 = {{11,21,31},{14,15,16},{27,28,92}};
		int result[][] = new int[matrix1.length][matrix2[0].length];	
		for(int i=0; i<matrix1.length; i++){
			for(int j=0; j<matrix2[i].length; j++){
				result[i][j] = 	matrix1[i][j] + matrix2[i][j];
			}
		}
		
		System.out.println();
		for(int i=0; i<result.length; i++){
			for(int j=0; j<result[i].length; j++){
				System.out.print(result[i][j]+ " ");
			}
			System.out.println();
		}
	}
}

/* Output :

12 23 34
18 20 22
34 36 101

*/