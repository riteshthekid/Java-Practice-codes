class SortString {
    public static void bubbleSort(char[] str){
        for(int i = 0; i < str.length-1; i++){
            for(int j = 0; j < str.length-i-1; j++){
                if(str[j] > str[j + 1]){
                    char temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        String eg = "ACDB";
        char[] str = eg.toCharArray();
        
        for(char c : str){
            System.out.print(c + " ");
        }
    }
}
