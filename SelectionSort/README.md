**PseudoCode**

~~~
SelectionSort(arr)
    n = length(arr)
    for i from 0 to n-1 do
        // Temukan elemen terkecil dalam sisa array yang tidak terurut
        min_idx = i
        for j from i+1 to n-1 do
            if arr[j] < arr[min_idx] then
                min_idx = j
        // Tukar elemen terkecil dengan elemen pertama dari bagian yang tidak terurut
        temp = arr[i]
        arr[i] = arr[min_idx]
        arr[min_idx] = temp
~~~

**Penjelasan Tahapan**

1. Inisialisasi Loop Luar (i):
   - Loop dari i = 0 hingga n-1.
2. Cari Elemen Terkecil:
   - Inisialisasi min_idx = i. Loop dalam mencari elemen terkecil di subarray mulai dari i+1 hingga n-1.
3. Pertukaran Elemen:
   - Tukar elemen terkecil dengan elemen pertama dari subarray yang belum terurut.

**Contoh Logika**

Array awal: [5, 3, 8, 4, 2]

- Iterasi 1:
  - Cari elemen terkecil dari indeks 0 hingga 4: 2
  - Tukar 5 dengan 2: [2, 3, 8, 4, 5]

- Iterasi 2:
  - Cari elemen terkecil dari indeks 1 hingga 4: 3
  - Tidak ada perubahan: [2, 3, 8, 4, 5]

- Iterasi 3:
  - Cari elemen terkecil dari indeks 2 hingga 4: 4
  - Tukar 8 dengan 4: [2, 3, 4, 8, 5]

- Iterasi 4:
  - Cari elemen terkecil dari indeks 3 hingga 4: 5
  - Tukar 8 dengan 5: [2, 3, 4, 5, 8]

Hasil akhir: [2, 3, 4, 5, 8]
