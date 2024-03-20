import java.util.Random;

public class main2 {


    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,64,42,123,5,7};

        int array2[] = {341, 345667, 7572, 234 ,56,6757,2, 4};

        int[] array3 = Merge(array1, array2);
        for(int i = 0; i<array3.length; i++){
            System.out.println(array3[i]);
        }

    }

    public static int[] Merge(int arr1[], int[] arr2){
        int[] arrres = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arrres[i] = arr1[i];
            arrres[i+arr1.length] = arr2[i];
        }
        return arrres;
    }


}
