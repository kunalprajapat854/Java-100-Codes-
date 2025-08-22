package Basics;

import java.util.Scanner;

public class even_odd {
   public static void main(String[] args) {

      try (// reading the values from the end user
            Scanner scanner = new Scanner(System.in)) {
         int num = scanner.nextInt();

         System.out.println("Enter the number " + num);

         // if(num % 2 ==0){
         // System.out.println("The given number is even " + "= "+ num);
         // } else {
         // System.out.println("The given number is odd " +"= "+ num );
         // }

         // using ternary operator
         // String even = (num %2==0) ? "Even" : "odd" ;
         // System.out.println(even);

         // using switch statements
         int n = num % 2;
         switch (n) {
            case 0:
               System.out.println("Even");
               break;

            case 1:
               System.out.println("Odd");

            default:
               break;
         }
      }

   }
}
