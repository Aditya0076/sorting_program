import java.util.*;

public class QuickSort {
    // Fungsi untuk melakukan partisi pada array
    int partition(int[] arr, int low, int high) {
        // Memilih elemen terakhir sebagai pivot
        int pivot = arr[high];
        // Inisialisasi indeks elemen yang lebih kecil dari pivot
        int i = low - 1;
        // Iterasi untuk memindahkan elemen yang lebih kecil dari pivot ke bagian kiri array
        for (int j = low; j < high; j++) {
            // Jika elemen saat ini lebih kecil dari pivot
            if (arr[j] < pivot) {
                i++;
                // Tukar elemen di i dengan elemen di j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Tempatkan pivot di posisi yang benar
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        // Kembalikan indeks pivot
        return i + 1;
    }

    // Fungsi untuk melakukan QuickSort pada array
    void quickSort(int[] arr, int low, int high) {
        // Jika low lebih kecil dari high, berarti array masih perlu diurutkan
        if (low < high) {
            // Partisi array dan dapatkan indeks pivot
            int pivot = partition(arr, low, high);
            // Panggil quickSort secara rekursif pada bagian kiri dari pivot
            quickSort(arr, low, pivot - 1);
            // Panggil quickSort secara rekursif pada bagian kanan dari pivot
            quickSort(arr, pivot + 1, high);
        }
    }

    // Fungsi main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);
        // Meminta pengguna memasukkan ukuran array
        System.out.print("Enter the size of the array: ");
        int jumlah = input.nextInt();
        // Membuat array dengan ukuran yang dimasukkan oleh pengguna
        int[] array = new int[jumlah];
        // Meminta pengguna memasukkan elemen-elemen array
        for (int i = 0; i < jumlah; i++) {
            array[i] = input.nextInt();
        }
        // Menampilkan array sebelum diurutkan
        System.out.print("Array unsorted: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Membuat objek QuickSort dan memanggil fungsi quickSort
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(array, 0, array.length - 1);

        // Menampilkan array setelah diurutkan
        System.out.print("Sorted array: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
