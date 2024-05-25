import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Membuat objek Scanner untuk input pengguna
        System.out.println("Enter the size of the array: ");  // Meminta pengguna memasukkan ukuran array
        int jumlah = input.nextInt();  // Membaca ukuran array dari input pengguna
        int[] array = new int[jumlah];  // Membuat array dengan ukuran yang diberikan
        System.out.println("Enter the elements of the array: ");  // Meminta pengguna memasukkan elemen-elemen array

        // Mengisi array dengan elemen yang dimasukkan oleh pengguna
        for (int i = 0; i < jumlah; i++) {
            array[i] = input.nextInt();  // Membaca elemen array satu per satu
        }

        // Algoritma Insertion Sort
        for (int i = 1; i < jumlah; i++) {
            int temp = array[i];  // Menyimpan elemen array saat ini
            int j = i - 1;  // Mengatur indeks j ke elemen sebelumnya
            // Memindahkan elemen array yang lebih besar dari temp ke posisi berikutnya
            while (j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];  // Memindahkan elemen array ke posisi berikutnya
                --j;  // Mengurangi nilai j
            }
            array[j + 1] = temp;  // Menempatkan temp di posisi yang tepat
        }

        // Mencetak array yang telah diurutkan
        System.out.println("The sorted array is: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(array[i] + " ");  // Mencetak setiap elemen array yang telah diurutkan
        }
    }
}
