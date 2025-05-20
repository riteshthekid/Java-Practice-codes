import java.util.Scanner;

public class SwapDigits{
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        String numStr = Integer.toString(num);
        char first = numStr.charAt(0);
        char last = numStr.charAt(numStr.length()-1);

        String swapNumStr = last + numStr.substring(1, numStr.length()-1) + first;
        int swappedNum = Integer.parseInt(swapNumStr);

        System.out.println("after swapping first and last digit: " + swappedNum);
    }
}