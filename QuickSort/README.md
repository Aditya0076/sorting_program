**Pseudocode**
~~~
QuickSort(array, low, high):
    // Memastikan bahwa bagian array yang akan diurutkan valid (low < high)
    if low < high:
        // Memanggil fungsi Partition untuk membagi array dan mendapatkan indeks pivot
        pivotIndex = Partition(array, low, high)
        
        // Rekursif, mengurutkan bagian kiri array sebelum pivot
        QuickSort(array, low, pivotIndex - 1)
        
        // Rekursif, mengurutkan bagian kanan array setelah pivot
        QuickSort(array, pivotIndex + 1, high)

// Fungsi untuk membagi array menjadi dua bagian berdasarkan pivot
Partition(array, low, high):
    // Memilih pivot (biasanya elemen terakhir)
    pivot = array[high]
    // Inisialisasi indeks untuk elemen terkecil
    smallerIndex = low - 1
    
    // Iterasi melalui bagian array yang akan dipartisi
    for i = low to high - 1:
        // Jika elemen saat ini kurang dari pivot
        if array[i] < pivot:
            // Meningkatkan indeks elemen terkecil
            smallerIndex = smallerIndex + 1
            // Menukar elemen yang lebih kecil dengan elemen saat ini
            Swap(array, i, smallerIndex)
    
    // Menukar pivot dengan elemen setelah elemen terkecil
    Swap(array, smallerIndex + 1, high)
    
    // Mengembalikan indeks pivot yang baru
    return smallerIndex + 1

// Fungsi untuk menukar nilai dua elemen dalam array
Swap(array, i, j):
    temp = array[i]
    array[i] = array[j]
    array[j] = temp

~~~

**Langkah-langkah Algoritma QuickSort**

~~~
Array awal: [7, 2, 1, 6, 8, 5, 3, 4]
~~~
**Langkah 1: Pilih Pivot**

Pivot yang dipilih bisa bervariasi. Misalnya, kita pilih elemen terakhir sebagai pivot. Dalam contoh ini, pivotnya adalah 4.

**Langkah 2: Partisi Array**

Kita partisi array menjadi dua bagian: elemen-elemen yang lebih kecil dari pivot (partisi kiri) dan elemen-elemen yang lebih besar dari pivot (partisi kanan). Setelah partisi, array akan terlihat seperti ini:

~~~
[2, 1, 3, 4, 8, 5, 7, 6]
~~~

**Langkah 3: Rekursi**

Kemudian, kita rekursif melakukan QuickSort pada kedua bagian array tersebut.

 - Bagian Kiri: [2, 1, 3]
   - Pivot: 1 (elemen terakhir)
   - Setelah partisi: [1, 2, 3] (tidak ada perubahan karena sudah terurut)

 - Bagian Kanan: [8, 5, 7, 6]
   - Pivot: 6 (elemen terakhir)
   - Setelah partisi: [5, 6, 7, 8] (tidak ada perubahan karena sudah terurut)

**Langkah 4: Gabungkan**

Ketika kedua bagian sudah terurut, kita gabungkan kembali array tersebut dengan memasukkan pivot di antara kedua bagian yang telah terurut. Hasil akhir setelah penggabungan adalah:

~~~
[1, 2, 3, 4, 5, 6, 7, 8]
~~~