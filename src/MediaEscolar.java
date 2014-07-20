/**
 *
 * @author Emisvaldo
 */
public class MediaEscolar {
    
    public static void main(String[] args){
        int nota1 = 0;
        int nota2 = 5;
        int nota3 = 4;
        int nota4 = 10;
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        if(media >= 5){
            System.out.println("Aprovado com média " + media);
        }else{
            System.out.println("Reprovado com média " + media);
        }
    
    }
    
}
