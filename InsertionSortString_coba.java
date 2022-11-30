/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertionsortstring_coba;

/**
 *
 * @author DzikyR
 */
public class InsertionSortString_coba {

public String[] sort(String array[], int f) //f=ukuran data
{
String temp="";
  for(int i=0;i<f;i++)
  {
   for(int j=i+1;j<f;j++)
    {
      if(array[i].compareToIgnoreCase(array[j])>0)
      {
       temp = array[i];
       array[i]=array[j];
       array[j]=temp;
      }
    }
  }
return array;
}
void tampilData(String arr[])
{
      int n = arr.length;
      for (int i = 0; i<n; ++i)
      System.out.println (arr[i]+" ");
      System.out.println ();
}

public static void main(String[] args) {
    String data[] ={"data"};
    int count = 0;
    InsertionSortString_coba obj = new InsertionSortString_coba();
    
    System.out.println("Data sebelum diurutkan: ");
    obj.tampilData(data);
    System.out.println("Data setelah diurutkan: ");
    obj.sort(data,data.length); 
    obj.tampilData(data);
    }
    
}
