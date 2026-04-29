//12.The Matrix Transposer 
//         Task: Create a 2D integer array (Matrix A) with 3 rows and 2 columns:
//                   int[][] matrixA = {
//                           {1, 2},
//                           {3, 4},
//                           {5, 6}
//                   };
//         Goal: Create a new 2D array (Matrix B) that is the transpose of Matrix A. This means Matrix B should have 2 rows and 3 columns, flipping the rows into columns. Finally, print Matrix B in a grid format.


public class matrixTransposer
{
	public static void main(String arg[])
	{
		int matrixA[][] = { {1,2}, {3,4}, {5,6} };
		int matrixB[][] = new int[2][3];
		for(int n[] : matrixA)
		{
			for(int m : n)
			{
				System.out.print(m +" ");
			}
			System.out.println();
		}
		for(int j=0; j<matrixA.length; j++)
		{
			for(int i=0; i<matrixA[j].length; i++)
			{
				matrixB[i][j] = matrixA[j][i];
			}
		}
		System.out.println("after transpose");
		for(int n[] : matrixB)
		{
			for(int m : n)
			{
				System.out.print(m +" ");
			}
			System.out.println();
		}
	
	}

}