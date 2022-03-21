package from_pseudo_to_java;


public class sixth {
    public static void main(String[] args) {
        int[] ARRAY = new int[]{1, 2, 3};
        int TEMP = 0;
        for (int i=0; i < ARRAY.length - 1; i++){
            if (ARRAY[i] > ARRAY[i + 1]){
                TEMP = ARRAY[i + 1];
                ARRAY[i + 1] = ARRAY[i];
                ARRAY[i] = TEMP;
            }
        }
    }
}
