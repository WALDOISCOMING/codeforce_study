
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class A {
    public static void main(String[] args) throws IOException {
        Program p = new Program();
        Scanner scanner = new Scanner(System.in);
String str = null;
str.charAt(1);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] pieces = new int[m];
        for (int i = 0; i < m; i++)
            pieces[i] = scanner.nextInt();

        Arrays.sort(pieces);
        p.run(n,m,pieces);
    }

    public static class Program {
        public void run(int n, int m, int[] f) {
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < m - n + 1; i++) {
                min = Math.min(min, f[i+n-1] - f[i]);
            }
            System.out.println(min);
        }
    }
}