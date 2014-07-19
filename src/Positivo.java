/**
 *
 * @author Emisvaldo
 */
import java.util.Scanner;
public class Positivo {
    
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        int i;
        
        Calculadora calculo = new Calculadora();
        
        System.out.println("Digite um valor: "); 
        
        i = tec.nextInt();
        
        if (i <= 0 ){
            calculo.multiplicacao(i, -1);
            System.out.println("Valor convertido: " + calculo.resultado);
        }else{
            System.out.println("Valor:" + i);
        }
                
    }
    
}
