package main.java.exercise;

public class MatrixAddition {
		public static int[][] addMatrices(int matrix1[][], int matrix2[][]) {
			int row1 = matrix1.length, col1 = matrix1[0].length, row2 = matrix2.length, col2 = matrix2[0].length;
			int[][] matrixSum = new int[2][2];
			if (row1 == row2 && col1 == col2) {
				for (int i = 0; i < row1; i++) {
					for (int j = 0; j < col1; j++) {
						matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
					}
				}
				return matrixSum;
			}
			else
			{
				return null;
			}
		}

	}

