/**
 *
 * @author Emisvaldo
 */
public class Calculadora {
    double num1;
    double num2;
    double resultado;
    double diferenca;
    
    double soma(int num1, int num2){
        this.resultado = num1 + num2;  
        return this.resultado;
    }
    
    double subtracao(int num1, int num2){
        this.resultado = num1 - num2;
        return this.resultado;
    }
    
    double multiplicacao(int num1, int num2){
        this.resultado = num1 * num2;
        return this.resultado;
    }    
    
    double divisao(int num1, int num2){
        this.resultado = num1 / num2;
        return this.resultado;
    }
    
    double diferenca(int num1, int num2){
        this.diferenca = num1 - num2;
        return this.diferenca;
    }
    
       
    
}
