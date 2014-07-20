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
public class LetraD {
    
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        int nota1 = 0;
        int nota2 = 10;
        int nota3 = 4;
        int nota4 = 10;
        int notaExame;
        double novaMedia;
        
        
        System.out.println("Digite a nota do 1° bimestre: ");
        nota1 = tec.nextInt();
        
        System.out.println("Digite a nota do 2° bimestre: ");
        nota2 = tec.nextInt();
        
        System.out.println("Digite a nota do 3° bimestre: ");
        nota3 = tec.nextInt();
        
        System.out.println("Digite a nota do 4° bimestre: ");
        nota4 = tec.nextInt();
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        
        
        if(media >= 7){
            System.out.println("Aprovado com média " + media);
        }else{
            System.out.println("Qual a nota do exame final");
            notaExame = tec.nextInt();
            novaMedia = (media + notaExame) / 2;
            
            if(novaMedia >= 5){
                System.out.println("Aprovado em exame.");
            }else{
                System.out.println("Reprovado");
            }
        }
        
    
    }
    
}
