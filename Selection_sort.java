/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package selection_sort;

/**
 *
 * @author DzikyR
 */
public class Selection_sort {
    void sort(int arr[])
    {
        int n = arr.length;
        for(int i=0; i<n-1; i++)
        {
            //menemukan elemen terkecil dari data array yang belum di urutkan
            int min_idx = i;
            for(int j=i+1; j<n; j++)
            
                if(arr[j]<arr[min_idx])
                    min_idx = j;
            
                //tukar posisi elemen terkecil tsb
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            
        }
    }
    void tampilArray(int arr[])
    {
        int n = arr.length;
        for(int i=0; i<n; ++i)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Selection_sort ob = new Selection_sort(); //instansiasi objek
        int arr[] = {40,34,35,65,12,45,50,32,10,12,01}; //data array yang mau di urutkan
        System.out.println("Data sebelum di urutkan: ");
        ob.tampilArray(arr); //panggil metod cetak array
        System.out.println("Data setelah di urutkan: ");
        ob.sort(arr); //panggil metod sort
        ob.tampilArray(arr);
        //kita cek lagi sintak sort
    }
    
}
