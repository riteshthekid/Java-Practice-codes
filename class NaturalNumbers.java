import java.util.*;

class NaturalNumbers {
    static void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Natural numbers up to " + n + ":");
        printNumbers(n); 
    }
}
