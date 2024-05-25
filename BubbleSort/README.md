**Alur Bubble Short**

**Pseudocode**

~~~
BubbleSort(arr, n)
    for i from 0 to n-1                       // (1)
        for j from 0 to n-i-1                 // (2)
            if arr[j] > arr[j + 1]            // (3)
                // Swap arr[j] and arr[j + 1] // (4)
                temp = arr[j]                 // (4.1)
                arr[j] = arr[j + 1]           // (4.2)
                arr[j + 1] = temp             // (4.3)
~~~

**Penjelasan Tahapan**

1. Inisialisasi Loop Luar (i)

~~~
for i from 0 to n-1
~~~~

- Deskripsi: Loop luar berjalan dari i = 0 hingga i = n-1.
- Tujuan: Mengontrol jumlah iterasi keseluruhan. Setelah setiap iterasi, elemen terbesar dari bagian yang belum terurut akan ditempatkan pada posisi yang benar di akhir array.

2. Inisialisasi Loop Dalam (j)
~~~
for j from 0 to n-i-1
~~~
- Deskripsi: Loop dalam berjalan dari j = 0 hingga j < n-i-1.
- Tujuan: Membandingkan dan menukar elemen yang berdekatan jika tidak dalam urutan yang benar. Batas n-i-1 memastikan bahwa elemen yang sudah terurut tidak dibandingkan lagi.

3. Membandingkan Elemen Berdekatan
~~~
if arr[j] > arr[j + 1]
~~~
- Deskripsi: Membandingkan elemen pada indeks j dengan elemen pada indeks j + 1.
- Tujuan: Menentukan apakah perlu menukar elemen untuk menempatkannya dalam urutan yang benar. Jika arr[j] lebih besar dari arr[j + 1], maka elemen-elemen tersebut ditukar.

4. Menukar Elemen (Proses Swap)

- Deskripsi dan Tujuan: Jika arr[j] lebih besar dari arr[j + 1], maka elemen-elemen tersebut perlu ditukar. Proses penukaran dilakukan dalam tiga langkah:

~~~
   temp = arr[j]        // (4.1) Menyimpan nilai arr[j] dalam variabel sementara temp
   arr[j] = arr[j + 1]  // (4.2) Mengganti nilai arr[j] dengan nilai arr[j + 1]
   arr[j + 1] = temp    // (4.3) Mengganti nilai arr[j + 1] dengan nilai temp (nilai asli arr[j])
~~~
**Tahapan Detail**

- *Iterasi Luar (i):*

  - Pada iterasi pertama (i = 0), loop dalam akan berjalan dari j = 0 hingga j = n-1-1 (hingga elemen kedua terakhir), memastikan bahwa elemen terbesar 'menggelembung' ke posisi terakhir.
  - Pada iterasi kedua (i = 1), loop dalam akan berjalan dari j = 0 hingga j = n-2-1, memastikan bahwa elemen terbesar kedua 'menggelembung' ke posisi kedua terakhir, dan seterusnya.

    Iterasi Dalam (j):
        Setiap iterasi dalam membandingkan elemen arr[j] dengan arr[j + 1] dan menukarnya jika diperlukan.
        Pada akhir setiap iterasi dalam, elemen terbesar dari bagian yang belum terurut akan berada di posisi yang benar di akhir bagian tersebut.

    Proses Swap:
        Langkah 4.1: Simpan nilai elemen arr[j] dalam variabel sementara temp.
        Langkah 4.2: Ganti nilai arr[j] dengan arr[j + 1].
        Langkah 4.3: Ganti nilai arr[j + 1] dengan nilai temp, yang menyimpan nilai asli arr[j].

**Contoh Ilustrasi**

Misalkan kita punya array arr = [5, 3, 8, 4, 2] dengan n = 5:

- Iterasi 1 (i = 0):

  - j = 0: bandingkan 5 dan 3, tukar menjadi [3, 5, 8, 4, 2]
  - j = 1: bandingkan 5 dan 8, tidak ada perubahan
  - j = 2: bandingkan 8 dan 4, tukar menjadi [3, 5, 4, 8, 2]
  - j = 3: bandingkan 8 dan 2, tukar menjadi [3, 5, 4, 2, 8]
  - Elemen terbesar 8 sudah di posisi akhir.

- Iterasi 2 (i = 1):
  - j = 0: bandingkan 3 dan 5, tidak ada perubahan
  - j = 1: bandingkan 5 dan 4, tukar menjadi [3, 4, 5, 2, 8]
  - j = 2: bandingkan 5 dan 2, tukar menjadi [3, 4, 2, 5, 8]
  - Elemen terbesar kedua 5 sudah di posisi kedua terakhir.

- Iterasi 3 (i = 2):
  - j = 0: bandingkan 3 dan 4, tidak ada perubahan
  - j = 1: bandingkan 4 dan 2, tukar menjadi [3, 2, 4, 5, 8]
  - Elemen terbesar ketiga 4 sudah di posisi ketiga terakhir.

- Iterasi 4 (i = 3):
  - j = 0: bandingkan 3 dan 2, tukar menjadi [2, 3, 4, 5, 8]
  - Semua elemen sudah terurut: [2, 3, 4, 5, 8].