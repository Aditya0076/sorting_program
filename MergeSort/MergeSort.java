import java.util.*;

public class MergeSort {

    // Metode untuk menggabungkan dua sub-array yang sudah terurut
    void merge(int[] array, int left, int middle, int right) {
        int[] temp = new int[right - left + 1];  // Array sementara untuk menampung elemen yang digabungkan
        int i = left;       // Indeks awal sub-array kiri
        int j = middle + 1; // Indeks awal sub-array kanan
        int k = 0;          // Indeks awal array sementara

        // Gabungkan kedua sub-array ke dalam array sementara
        while (i <= middle && j <= right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        // Salin sisa elemen dari sub-array kiri, jika ada
        while (i <= middle) {
            temp[k++] = array[i++];
        }

        // Salin sisa elemen dari sub-array kanan, jika ada
        while (j <= right) {
            temp[k++] = array[j++];
        }

        // Salin elemen yang diurutkan dari array sementara kembali ke array asli
        for (int l = 0; l < temp.length; l++) {
            array[left + l] = temp[l];
        }
    }

    // Metode untuk mengurutkan array menggunakan algoritma Merge Sort
    void sort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;  // Temukan titik tengah array
            sort(array, left, middle);        // Urutkan sub-array kiri
            sort(array, middle + 1, right);   // Urutkan sub-array kanan
            merge(array, left, middle, right); // Gabungkan kedua sub-array yang telah terurut
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int jumlah = input.nextInt();
        int[] array = new int[jumlah];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < jumlah; i++) {
            array[i] = input.nextInt();
        }

        MergeSort obj = new MergeSort();
        int left = 0; // Batas kiri array
        int right = jumlah - 1; // Batas kanan array
        obj.sort(array, left, right); // Panggil metode sort untuk mengurutkan array
        // print sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
