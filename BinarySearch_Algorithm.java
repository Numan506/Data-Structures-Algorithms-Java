
package BrainStationExam;

import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch_Algorithm {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("How many number you want input here: ");
        int n = input.nextInt();
        int num[] = new int[n];
        
       
        
        for (int i = 0; i < n; i++) {
            num[i] = input.nextInt();
        }
       
        Arrays.sort(num);
  
        
        System.out.print("Which number you find here: ? ");
        int findNumber = input.nextInt();
        
        int count = 0;
        int left = 0;
        int right = n-1;
        
        while(left<=right){
            int mid =(left+right)/2;
            
            if(num[mid] == findNumber){
                System.out.println("your find number is: "+num[mid] +"and index number is:"+mid);
                count++;
                break;
            }if(num[mid]<findNumber){
                left = mid+1;
            }else{
                right = mid-1;
            }
            
        }if(count ==0){
            System.out.println("Sorry your number not Found");
        }
        
        
        
        
    }
}
