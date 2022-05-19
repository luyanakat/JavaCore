import java.util.Scanner;
public class Matrix2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.print("Enter row m: ");
        m = sc.nextInt();
        System.out.print("Enter column n: ");
        n = sc.nextInt();

        int[][] arr2d = new int[m][n];

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.println(arr2d[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
