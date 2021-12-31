/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greatlearning.dsa;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Transaction {
    
    public static void main(String[]args)
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the size of the transaction array");
        int size = scan1.nextInt();
        int[] transactions = new int[size];
        System.out.println("Enter the values of transaction");
        
        
        
        for(int i=0;i<size;i++)
        {
            transactions[i]=scan1.nextInt();
        }
        System.out.println("Enter the total no of target that is to achieved");
        int targetNo = scan1.nextInt();
        while(targetNo > 0 )
        {
            int flag = 0;
            int target;
            System.out.println("Enter the value of the target");
            target = scan1.nextInt();
            
            long sumOfTransactions = 0;
            for(int i=0;i<size;i++)
            {
                sumOfTransactions = sumOfTransactions + transactions[i];
                
                if(sumOfTransactions >= target)
                {
                    System.out.println("Target achieved after "+(i+1)+" Transaction");
                    flag = 1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println("Given target is not achieved");
            }
            targetNo--;
        }
        
        System.out.println("you have finished your target check");
    } 
}
