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
public class LetraE {
    
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        
        int a, b, c;
        double x1, x2;
        
        System.out.println("Digite o valor de A: ");
        a = tec.nextInt();
        if(a == 0){
            System.out.println("A nao pode ser igual a 0:");
            System.out.println("Digite um valor diferente de 0: ");
            a = tec.nextInt();            
        }
        
        System.out.println("Digite o valor de B: ");
        b = tec.nextInt();
        
        System.out.println("Digite o valor de C: ");
        c = tec.nextInt();        
        
        int b2 = b * b;
        double delta = b2 - (4 * a * c);
        
        if(delta > 0){
            x1 = (-b + Math.sqrt(delta)) / 2 * a;
            x2 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.println("A primeira raiz de X é " + x1);
            System.out.println("A segunda raiz de X é " + x2);
        }else if(delta < 0){
            System.out.println("Não pertence aos reais");
        }else{
            System.out.println("As raizes são iguais.");
        }  
        
        
    }
    
}
