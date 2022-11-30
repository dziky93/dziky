/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package belajar_stack;
import java.util.Stack;
/**
 *
 * @author DzikyR
 */
public class Belajar_stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack stack1 = new Stack();
        stack1.push("A"); //Fungsi "push" untuk memasukkan data ke dalam stack 
        stack1.push("B");
        stack1.push("C");
        stack1.push("D");
        
        stack1.pop();
//      pop = mengurangi data stack 
        System.out.println(stack1);
        
        System.out.println("Apakah stack kosong?" +stack1.isEmpty());
//      jadikan syntack ke 21 - 24 / push stack menjadi komentar dan run program
        
        System.out.println("ukuran? "+stack1.size());
//      hapus salah satu atau beberapa stack
        
        stack1.peek();
//      peek = menampilakan data terakhir
//      hapus salah satu atau beberapa stack
        System.out.println(stack1.peek());
       
    }
    
}
