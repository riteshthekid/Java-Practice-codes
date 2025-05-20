public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello World!";
        char[] charArray = input.toCharArray();

        int left = 0, right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        String reversed = new String(charArray);
        System.out.println("Reversed string: " + reversed);
    }
}