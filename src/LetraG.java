/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emisvaldo
 */
import java.util.Scanner;
public class LetraG {
    
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        
        int num1, num2, num3, num4;
        
        System.out.println("Digite o 1° valor:");
        num1 = tec.nextInt();
        System.out.println("Digite o 2° valor:");
        num2 = tec.nextInt();
        System.out.println("Digite o 3° valor:");
        num3 = tec.nextInt();
        System.out.println("Digite o 4° valor:");
        num4 = tec.nextInt();
                
        
        if(num1 % 2 == 0 | num1 % 3 == 0){
            System.out.println("");
            System.out.println(num1);
        }
        
        if(num2 % 2 == 0 | num2 % 3 == 0){
            System.out.println("");
            System.out.println(num2); 
        }
        
        if(num3 % 2 == 0 || num3 % 3 == 0){
            System.out.println("");
            System.out.println(num3);
        }
        
        if(num4 % 2 == 0 || num4 % 3 == 0){
            System.out.println("");
            System.out.println(num4);
        }              
        
    }
    
}
