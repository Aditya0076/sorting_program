import java.util.*;

public class QuickSort {
    // Metode untuk memulai proses pengurutan QuickSort
    void Sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr, low, high);
    }

    // Metode rekursif untuk membagi dan mengurutkan array menggunakan QuickSort
    void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Dapatkan indeks pivot setelah partisi
            int pivotIndex = partition(arr, low, high);
            // Panggil QuickSort rekursif untuk partisi sebelum pivot
            quickSort(arr, low, pivotIndex - 1);
            // Panggil QuickSort rekursif untuk partisi setelah pivot
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Metode untuk membagi array dan mendapatkan indeks pivot
    int partition(int[] arr, int low, int high) {
        // Pilih pivot (misalnya, elemen terakhir)
        int pivot = arr[high];
        // Inisialisasi indeks untuk elemen terkecil
        int smallerIndex = low - 1;

        // Lakukan partisi array
        for (int i = low; i < high; i++) {
            // Jika elemen saat ini kurang dari pivot
            if (arr[i] < pivot) {
                // Tingkatkan indeks elemen terkecil
                smallerIndex++;
                // Tukar elemen yang lebih kecil dengan elemen saat ini
                swap(arr, i, smallerIndex);
            }
        }

        // Tukar pivot dengan elemen setelah elemen terkecil
        swap(arr, smallerIndex + 1, high);

        // Kembalikan indeks pivot yang baru
        return smallerIndex + 1;
    }

    // Metode untuk menukar nilai dua elemen dalam array
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Metode untuk mencetak array
    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Metode main untuk menjalankan program
    public static void main(String[] args) {
        // Membaca input dari pengguna untuk ukuran dan elemen array
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int jumlah = input.nextInt();
        int[] array = new int[jumlah];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < jumlah; i++) {
            array[i] = input.nextInt();
        }

        // Membuat objek QuickSort dan mengurutkan array
        QuickSort qs = new QuickSort();
        qs.Sort(array);

        // Mencetak array yang telah diurutkan
        System.out.print("Sorted array: ");
        qs.printArray(array);
    }
}
