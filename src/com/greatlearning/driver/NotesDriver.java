/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.service.MergeSortImpl;
import com.greatlearning.service.NotesCount;
/**
 *
 * @author asus
 */
public class NotesDriver {
    public static void main(String[] args){
        MergeSortImpl mergeSortImpl = new MergeSortImpl();
        NotesCount notesCount = new NotesCount();
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Currency denominations: ");
        size = sc.nextInt();
        System.out.println("Enter the currency denomination values: ");
        int noteDenomination[]= new int[size];
        for(int i=0;i<size;i++)
        {
            noteDenomination[i] = sc.nextInt();
        }
        System.out.println("Please enter the amount you want to pay: ");
        int amt = sc.nextInt();
        
        mergeSortImpl.mergeSort(noteDenomination,0,noteDenomination.length-1);
        for(int i=0;i<noteDenomination.length;i++)
        {
            System.out.print(noteDenomination[i]+ " ");
        }
        notesCount.implementNotesCount(noteDenomination,amt);
        
     
    }
}
