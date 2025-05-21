public class MinMax{
    public static void main(String[] args){
        int[] numbers = {12, 5, 8, 19, 3, 7};

        int max = numbers[0];
        int min = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
