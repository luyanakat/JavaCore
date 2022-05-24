import java.util.Scanner;
public class MatrixEmpty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;

        do {
            System.out.print("Enter row m: ");
                m = sc.nextInt();
            System.out.print("Enter column n: ");
                n = sc.nextInt();
        } while (m < 1 && n < 1);

        int[][] arr2d = new int[m][n];

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print("Enter arr[" + i + "][" + j + "]: ");
                arr2d[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix: ");
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(arr2d[i][j] + "\t");
            }
            System.out.println();
        }

        int count0 = 0;
        int countAnother = 0;
        for (int i=0; i<m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr2d[i][j] == 0) {
                    count0++;
                } else {
                    countAnother++;
                }
            }
        }

        if (count0 > countAnother) {
            System.out.println("This is Sparse matrix");
        }
        else {
            System.out.println("This is not Sparse matrix");
        }

    }
}
