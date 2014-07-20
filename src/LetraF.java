/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emisvaldo
 */
// imports necessarios
import java.util.Arrays;
import java.util.Scanner;
public class LetraF {
        
    public static void main(String[] args){
        //Constrói um objeto que permite inserir numeros no console
        Scanner tec = new Scanner(System.in);
        
        // Constrói um Array com 5 posições
        int[] listaDeNumeros = new int[4];
        
        // Preenche o Array a parti da posição 1
        for(int i = 1; i < listaDeNumeros.length; i++){
            System.out.println("Digite" + i + "° numeros: ");
            listaDeNumeros[i] = (tec.nextInt());
        }
        
        // Coloca o Array em ordem crescente
        Arrays.sort(listaDeNumeros);
        
        // Lista o Array em ordem crescente
        System.out.println("Ordem crescente:  ");
        for(int j = 1; j < listaDeNumeros.length; j++){
            System.out.println(listaDeNumeros[j] + " ");
        }        
        
    }
    
}
