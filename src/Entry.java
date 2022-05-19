import java.util.Scanner;
public class Entry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int key;
        System.out.print("Enter length of nums: ");
        n = sc.nextInt();
        int[] nums = new int[n];
        // enter nums
        for (int i=0; i<n; i++) {
            System.out.print("Enter nums[" + i + "]: ");
            nums[i] = sc.nextInt();
        }
        // do
        do {
            System.out.print("Arrays: Nums = {");
            for (int i = 0; i < n; i++) {
                System.out.print(nums[i] + ", ");
            }
            System.out.println("}");
            System.out.println("1. Sort the arrays from lowest to highest");
            System.out.println("2. Sort the arrays from highest to lowest");
            System.out.println("3. Find the biggest number in arrays");
            System.out.println("4. Find the smallest number in arrays");
            System.out.println("5. Calculate the sum of arrays");
            System.out.println("6. Exit");
            System.out.print("Enter number: ");
            key = sc.nextInt();
            switch (key) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (nums[j] < nums[i]) {
                                int swap = nums[i];
                                nums[i] = nums[j];
                                nums[j] = swap;
                            }
                        }
                    }
                    System.out.print("Arrays after sort: ");
                    System.out.print("{");
                    for (int i = 0; i < n; i++) {
                        System.out.print(nums[i] + ", ");
                    }
                    System.out.print("}");
                    break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (nums[j] > nums[i]) {
                                int swap = nums[i];
                                nums[i] = nums[j];
                                nums[j] = swap;
                            }
                        }
                    }
                    System.out.print("Arrays after sort: ");
                    System.out.print("{");
                    for (int i = 0; i < n; i++) {
                        System.out.print(nums[i] + ", ");
                    }
                    System.out.print("}");
                    break;
                default:  ;
            }
        } while (key != 6);
    }
}
