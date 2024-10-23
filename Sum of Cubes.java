import java.util.Scanner;

public class SumOfCubes {
    public static int sumOfCubes(int M, int N) {
        if (M > N) {
            return 0;
        }
        int sum = 0;
        for (int i = M; i <= N; i++) {
            sum += i * i * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter M: ");
        int M = scanner.nextInt();
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        
        int result = sumOfCubes(M, N);
        if (result == 0) {
            System.out.println("M is greater than N, returning 0.");
        } else {
            System.out.println("Sum of cubes from " + M + " to " + N + " is " + result);
        }
    }
}
