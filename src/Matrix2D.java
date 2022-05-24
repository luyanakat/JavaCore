import java.util.Scanner;
public class Matrix2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        do {
            System.out.print("Enter row m: ");
            m = sc.nextInt();
            System.out.print("Enter column n: ");
            n = sc.nextInt();
        } while (m<1 && n<1);

        int[][] arr2d = new int[m][n];
        int[][] arr2d2 = new int[m][n];
        //
        int[][] sum = new int[m][n];

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print("Enter arr2d[" + i + "][" + j + "]: ");
                arr2d[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print("Enter arr2d2[" + i + "][" + j + "]: ");
                arr2d2[i][j] = sc.nextInt();
            }
        }


        System.out.println("Matrix 1: ");
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(arr2d[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matrix 2: ");
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(arr2d2[i][j] + "\t");
            }
            System.out.println();
        }

        // Calculate Sum two matrix
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                sum[i][j] = arr2d[i][j] + arr2d2[i][j];
            }
        }
        //
        System.out.println("Sum of two matrix: ");
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
