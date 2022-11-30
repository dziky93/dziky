/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array1dimensi;

/**
 *
 * @author DzikyR
 */
public class Array1dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=====================================================");
        System.out.println("****************Mengenal Bentuk Array****************");
        System.out.println("=====================================================");
        System.out.println("************Contoh Implementasi Array Ke-1***********");
        
        String array1[] = {"dziky","irfan","afi","lulu","qibti"};
        System.out.println("Array ke-0 = "+array1[0]);
        System.out.println("Array ke-1 = "+array1[1]);
        System.out.println("Array ke-0 = "+array1[2]);
        System.out.println("Array ke-1 = "+array1[3]);
        System.out.println("Array ke-1 = "+array1[4]);
        
        //Model ke-2
        System.out.println("=====================================================");
        System.out.println("************Contoh Implementasi Array Ke-2***********");
        System.out.println("=====================================================");
        String vokal[];
        vokal = new String[5];
        
        vokal[0]="A";
        vokal[1]="B";
        vokal[2]="C";
        vokal[3]="D";
        vokal[4]="E";
        
        System.out.println(vokal[0]);
        System.out.println(vokal[1]);
        System.out.println(vokal[2]);
        System.out.println(vokal[3]);
        System.out.println(vokal[4]);
    }
    
}
