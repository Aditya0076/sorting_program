**PseudoCode**

~~~
SelectionSort(arr)
    n = length(arr)
    for i from 0 to n-1 do
        // Temukan elemen terkecil dalam sisa array yang tidak terurut
        for j from i+1 to n-1 do
            if arr[i]>array[j] then   
            // Tukar elemen terkecil dengan elemen pertama dari bagian yang tidak terurut
            temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
            endif
        endfor
    endfor
~~~


**Contoh Logika**

Array awal: [64,25,12,22,11]

1. Iterasi Pertama (i = 0):
   - Cari elemen terkecil dari arr[1] hingga arr[4]. Elemen terkecil adalah 11.
   - Tukar arr[0] dengan arr[4].
   - Array setelah iterasi pertama: [11, 25, 12, 22, 64].

2. Iterasi Kedua (i = 1):
   - Cari elemen terkecil dari arr[2] hingga arr[4]. Elemen terkecil adalah 12.
   - Tukar arr[1] dengan arr[2].
   - Array setelah iterasi kedua: [11, 12, 25, 22, 64].

3. Iterasi Ketiga (i = 2):
   - Cari elemen terkecil dari arr[3] hingga arr[4]. Elemen terkecil adalah 22.
   - Tukar arr[2] dengan arr[3].
   - Array setelah iterasi ketiga: [11, 12, 22, 25, 64].

4. Iterasi Keempat (i = 3):
   - Cari elemen terkecil dari arr[4]. Elemen terkecil adalah 25.
   - Tidak ada penukaran karena 25 sudah berada di posisi yang benar.
   - Array setelah iterasi keempat: [11, 12, 22, 25, 64].

5. Iterasi Kelima (i = 4):
   - Semua elemen sudah terurut, algoritma selesai.

Akhirnya, array terurut adalah [11, 12, 22, 25, 64].


**Gambar Ilustrasi Algoritma SelectionSort**
![Gambar Algoritma SelectionSort](../Assets/Selection%20Sort.png)