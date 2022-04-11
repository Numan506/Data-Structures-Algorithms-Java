
package BrainStationExam;

import java.util.Scanner;


public class linearSearch_Algorithm {
    public static void main(String[] args) {
   
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("How many number do you want: ");
        int n = input.nextInt();
        int [] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        System.out.println("Which number you want: ");
        int num = input.nextInt();
        
   
        int i;
        
        
        for ( i = 0; i < n; i++) {
            if(arr[i] == num){
                System.out.println("find index number: "+i + " And value is: "+arr[i]);
                
                count++;
                break;
                
            }
        }if( count == 0){
            System.out.println("Sorry Not found");
        }

    
}
}