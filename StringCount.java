import java.util.Scanner;

class StringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (currentChar == 'a' || currentChar == 'A') {
                count++;
            }
        }

        System.out.println("The letter 'a' appears " + count + " times in the string.");
    }
}
