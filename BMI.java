
package bmi;

import java.util.Scanner;
public class BMI {

    
   
   public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       System.out.println("Hellow welacome to BMI calculator");
      System.out.println("Please Enter your Height:");
       double Height=input.nextDouble();
       
       System.out.println("Please Enter your weight:");
       double Weight=input.nextDouble();
       double BMI =(Weight/(Height*Height));
       if(BMI<18.5){
           System.out.println("Your BMI is"+BMI+"And Based on the Calculated BMI you have (Underweight)   ");
       }
       else if(18.5<=BMI||BMI>=24.9){
           System.out.println("Your BMI is"+BMI+"And Based on the Calculated BMI you have (Normalweight) ");
       } 
       else if(25<=BMI||BMI>=29.9){
           System.out.println("Your BMI is"+BMI+"And Based on the Calculated BMI you have (Overweight) ");  
       }
       else
             System.out.println("Your BMI is"+BMI+"And Based on the Calculated BMI you have (Obese) ");
       
   
   
    }
    
}
