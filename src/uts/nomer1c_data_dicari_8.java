/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.util.Scanner;
import static uts.nomer1b_binnary_searching.binarySearch;
import static uts.nomer1b_binnary_searching.printData;
import static uts.nomer1b_binnary_searching.selectionSort;

/**
 *
 * @author Lenovo ID
 */
public class nomer1c_data_dicari_8 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] nilai = {3,10,4,2,8,13};
        System.out.println("before");
        printData(nilai);
        selectionSort(nilai);
        System.out.println("\nafter");
        printData(nilai);
        
        System.out.println("\nmasukan data yang ingin di cari:");
        int key = input.nextInt();
        
        binarySearch(nilai, key);
        
        System.out.println();
      
    }
}
