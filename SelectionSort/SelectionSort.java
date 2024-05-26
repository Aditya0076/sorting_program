import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        //      input jumlah array
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int jumlah= input.nextInt();
        int[] array= new int[jumlah];

        // melakukan looping untuk memasukkan array
        for (int i = 0; i < jumlah; i++) {
            array[i]= input.nextInt();
        }

        // melakukan looping untuk sorting array menggunakan selection sort
        for (int i = 0; i < jumlah-1; i++) {
            for (int j = i+1; j < jumlah-1; j++) {
                // mengecek apakah array berindeks i lebih dari array berindeks j
                if (array[i] > array[j]) {
                    // Penukaran value terkecil dengan value pertama dari bagian tidak terurut
                    int temp= array[i];
                    array[i]= array[j];
                    array[j]= temp;
                }

            }
        }

        //      print hasil array
        System.out.print("The sorted array is: ");
        System.out.print("{");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("}");
    }
}