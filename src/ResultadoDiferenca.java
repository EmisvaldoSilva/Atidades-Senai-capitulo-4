/**
 *
 * @author Emisvaldo Silva
 */
import java.util.Scanner;
public class ResultadoDiferenca {
    
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        int num1;
        int num2;
        
        Calculadora calculo = new Calculadora();
        
        System.out.println("Digete um valor: ");
        num1 = tec.nextInt();
        
        System.out.println("Digete outro valor: ");
        num2 = tec.nextInt();
        
        if (num1 > num2){
            calculo.diferenca(num1, num2);            
        }else{
            calculo.diferenca(num2, num1);
        }
        
        System.out.println("A diferença do maior para o menor: " + calculo.diferenca);       
    }
    
}
