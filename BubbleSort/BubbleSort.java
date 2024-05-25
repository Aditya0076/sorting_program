import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //input jumlah array
        System.out.println("Enter the size of the array:");
        int jumlah=input.nextInt();
        int[] array=new int[jumlah];

        //input array
        for(int i=0;i<jumlah;i++){
            array[i]=input.nextInt();
        }
        //sort array
        for(int i=0;i<jumlah-1;i++){
            for(int j=0;j<jumlah-i-1;j++){
                // pengecekan array
                if(array[j]>array[j+1]){
                    // inisialisasi variabel temp untuk variabel bantuan
                    int temp=array[j];
                    // pertukaran array
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        //  Cetak Hasil Sorted Array
        System.out.println("Sorted Array:");
        for(int i=0;i<jumlah;i++){
            System.out.print("["+array[i]+"]");
        }
    }
}