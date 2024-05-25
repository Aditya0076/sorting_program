**Pseudocode**

~~~
// Metode untuk mengurutkan array menggunakan algoritma Merge Sort
MergeSort(array, left, right):
    // Cek jika left kurang dari right, jika tidak, array sudah terurut
    if left < right:
        // Temukan titik tengah array
        middle = (left + right) / 2
        
        // Rekursif, urutkan sub-array kiri dari left hingga middle
        MergeSort(array, left, middle)
        
        // Rekursif, urutkan sub-array kanan dari middle + 1 hingga right
        MergeSort(array, middle + 1, right)
        
        // Gabungkan kedua sub-array yang telah terurut
        Merge(array, left, middle, right)

// Metode untuk menggabungkan dua sub-array yang sudah terurut
Merge(array, left, middle, right):
    // Hitung panjang sub-array kiri dan kanan
    n1 = middle - left + 1
    n2 = right - middle
    
    // Buat array sementara untuk menyimpan sub-array kiri dan kanan
    leftArray = new array[n1]
    rightArray = new array[n2]
    
    // Salin data dari array asli ke array sementara
    for i = 0 to n1 - 1:
        leftArray[i] = array[left + i]
    for j = 0 to n2 - 1:
        rightArray[j] = array[middle + 1 + j]
    
    // Inisialisasi indeks untuk array asli dan array sementara
    i = 0
    j = 0
    k = left
    
    // Gabungkan kedua sub-array
    while i < n1 and j < n2:
        if leftArray[i] <= rightArray[j]:
            array[k] = leftArray[i]
            i = i + 1
        else:
            array[k] = rightArray[j]
            j = j + 1
        k = k + 1
    
    // Salin sisa elemen dari sub-array kiri, jika ada
    while i < n1:
        array[k] = leftArray[i]
        i = i + 1
        k = k + 1
    
    // Salin sisa elemen dari sub-array kanan, jika ada
    while j < n2:
        array[k] = rightArray[j]
        j = j + 1
        k = k + 1
~~~

**Langkah-langkah Merge Sort**

1. Pembagian (Divide):

Pada tahap ini, array dibagi menjadi sub-array yang lebih kecil secara rekursif hingga setiap sub-array hanya memiliki satu elemen. Proses ini terus berlanjut sampai tidak ada lagi sub-array yang bisa dibagi.

Misalkan kita memiliki array awal [38, 27, 43, 3, 9, 82, 10].

- Pembagian pertama menghasilkan dua sub-array: [38, 27, 43, 3] dan [9, 82, 10].
- Kemudian, sub-array tersebut dibagi menjadi sub-array yang lebih kecil hingga hanya satu elemen.

2. Pengurutan (Conquer):

Setelah array dibagi menjadi sub-array yang lebih kecil, setiap sub-array diurutkan secara terpisah. Ini dilakukan dengan membandingkan elemen-elemen di dalam sub-array dan menukar posisi mereka jika diperlukan sehingga sub-array menjadi terurut.

Misalkan sub-array [38, 27, 43, 3] diurutkan menjadi [3, 27, 38, 43] dan sub-array [9, 82, 10] diurutkan menjadi [9, 10, 82].
3. Gabungan (Merge):

Pada tahap ini, sub-array yang telah diurutkan digabungkan kembali menjadi array yang lebih besar secara terurut. Proses penggabungan dilakukan dengan membandingkan elemen-elemen dari dua sub-array dan menempatkannya ke dalam array utama sesuai dengan urutan yang benar.

Misalkan sub-array [3, 27, 38, 43] dan [9, 10, 82] digabungkan menjadi array [3, 9, 10, 27, 38, 43, 82].
Ilustrasi Proses

Misalkan kita memiliki array awal [38, 27, 43, 3, 9, 82, 10]. Berikut adalah ilustrasi langkah-langkah Merge Sort:

  1. Pembagian (Divide):
     - Array dibagi menjadi sub-array: [38, 27, 43, 3] dan [9, 82, 10].
     - Sub-array tersebut kemudian dibagi menjadi sub-array yang lebih kecil hingga hanya satu elemen.

  2. Pengurutan (Conquer):
     - Setiap sub-array diurutkan secara terpisah. Misalnya, [38, 27, 43, 3] menjadi [3, 27, 38, 43] dan [9, 82, 10] menjadi [9, 10, 82].

  3. Gabungan (Merge):
     - Sub-array yang telah diurutkan digabungkan kembali secara berurutan. Misalnya, [3, 27, 38, 43] dan [9, 10, 82] digabungkan menjadi [3, 9, 10, 27, 38, 43, 82].

Dengan demikian, kita mendapatkan array yang telah diurutkan [3, 9, 10, 27, 38, 43, 82].