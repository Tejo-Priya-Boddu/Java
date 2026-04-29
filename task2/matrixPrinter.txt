//8.The Matrix Printer (2D Arrays)
//         Task: Create a 2-Dimensional integer array matrix[][] = new int[3][4];. Manually assign different values to specific indexes (e.g., matrix[0][1] = 5;).
//         Goal: Use Nested Loops (an outer loop for rows, inner loop for columns) to print the 2D array in a proper grid/matrix format.


public class matrixPrinter
{
	public static void main(String arg[])
	{
		int matrix[][] = new int[3][4];
		matrix[0][0] = 4;
		matrix[0][1] = 9;
		matrix[0][2] = 3;
		matrix[0][3] = 8;
		matrix[1][0] = 5;
		matrix[1][1] = 0;
		matrix[1][2] = 1;
		matrix[1][3] = 4;
		matrix[2][0] = 9;
		matrix[2][1] = 2;
		matrix[2][2] = 7;
		matrix[2][3] = 6;
		for(int i=0; i<matrix.length; i++)
		{
			for(int j=0; j<matrix[i].length; j++)
			{	
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}

		