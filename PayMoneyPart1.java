

import java.util.*;
import java.lang.*;
import java.io.*;


class PayMoneyPart1
{
  public static void main (String[] args) throws java.lang.Exception
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of transaction array");
    int transactionsCount = sc.nextInt();
    int[] transactions = new int[2000];

    System.out.println("Enter the values of array");
    for(int i = 0; i < transactionsCount; i++)
      transactions[i] = sc.nextInt();

    System.out.println("Enter the total no of targets that needs to be achieved");
    int targetsCount = sc.nextInt();
    
    for (int i = 0; i < targetsCount; i++) {
      System.out.println("Enter the value of target");
        
        int target = sc.nextInt();
        int prevSum = 0;
        int loopCounter = 0;
      
      while(prevSum < target){
        // System.out.println(prevSum + "-"+ loopCounter);

        if(loopCounter == transactionsCount){
          System.out.println("Given target is not achieved");
          break;
        }
        

        prevSum += transactions[loopCounter];
        
        if(prevSum >= target){
          System.out.println("Target achieved after "+ (loopCounter + 1) + " transactions");
          break;
        }
        
        loopCounter++;
      }
    }
  }
}