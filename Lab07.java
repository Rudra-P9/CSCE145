// Name: Rudrakumar Patel

import java.util.Scanner;

public class Lab07 {

    // Function to add two matrices
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] result = new int[matrixA.length][matrixA[0].length];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Initialize a Scanner object to read user input
        Scanner key = new Scanner(System.in);

        // Get the dimensions of the first matrix from the user
        int rowsA, colsA;
        while (true) {
            System.out.print("Enter the number of rows for the first matrix: ");
            if (key.hasNextInt()) {
                rowsA = key.nextInt();
                key.nextLine(); // Consume newline left-over
                if (rowsA > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
                key.nextLine(); // Consume invalid input
            }
        }

        while (true) {
            System.out.print("Enter the number of columns for the first matrix: ");
            if (key.hasNextInt()) {
                colsA = key.nextInt();
                key.nextLine(); // Consume newline left-over
                if (colsA > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
                key.nextLine(); // Consume invalid input
            }
        }

        // Get the dimensions of the second matrix from the user
        int rowsB, colsB;
        while (true) {
            System.out.print("Enter the number of rows for the second matrix: ");
            if (key.hasNextInt()) {
                rowsB = key.nextInt();
                key.nextLine(); // Consume newline left-over
                if (rowsB > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
                key.nextLine(); // Consume invalid input
            }
        }

        while (true) {
            System.out.print("Enter the number of columns for the second matrix: ");
            if (key.hasNextInt()) {
                colsB = key.nextInt();
                key.nextLine(); // Consume newline left-over
                if (colsB > 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
                key.nextLine(); // Consume invalid input
            }
        }

        // Check if the dimensions of the two matrices match
        while (rowsA != rowsB || colsA != colsB) {
            System.out.println("The dimensions of the two matrices do not match. Please re-enter the dimensions of the second matrix.");
            while (true) {
                System.out.print("Enter the number of rows for the second matrix: ");
                if (key.hasNextInt()) {
                    rowsB = key.nextInt();
                    key.nextLine(); // Consume newline left-over
                    if (rowsB > 0) {
                        break;
                    } else {
                        System.out.println("Please enter a positive integer.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a positive integer.");
                    key.nextLine(); // Consume invalid input
                }
            }

            while (true) {
                System.out.print("Enter the number of columns for the second matrix: ");
                if (key.hasNextInt()) {
                    colsB = key.nextInt();
                    key.nextLine(); // Consume newline left-over
                    if (colsB > 0) {
                        break;
                    } else {
                        System.out.println("Please enter a positive integer.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a positive integer.");
                    key.nextLine(); // Consume invalid input
                }
            }
        }

        // Initialize the matrices
        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];

        // Get the values of the first matrix from the user
        System.out.println("Enter the values of the first matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                while (true) {
                    System.out.print("Enter the value at row " + (i + 1) + " column " + (j + 1) + ": ");
                    if (key.hasNextInt()) {
                        matrixA[i][j] = key.nextInt();
                        key.nextLine(); // Consume newline left-over
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter an integer.");
                        key.nextLine(); // Consume invalid input
                    }
                }
            }
        }

        // Get the values of the second matrix from the user
        System.out.println("Enter the values of the second matrix:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                while (true) {
                    System.out.print("Enter the value at row " + (i + 1) + " column " + (j + 1) + ": ");
                    if (key.hasNextInt()) {
                        matrixB[i][j] = key.nextInt();
                        key.nextLine(); // Consume newline left-over
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter an integer.");
                        key.nextLine(); // Consume invalid input
                    }
                }
            }
        }

        // Add the two matrices
        int[][] result = addMatrices(matrixA, matrixB);

        // Print the result
        System.out.println("The sum of the two matrices is:");
        printMatrix(result);

        key.close();
    }
} 