public class ExemploBreakContinue {
    public static void main(String[] args) {
        //Situação 1 - break
        System.out.println("Resultado situação 1 - break");
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
            
            System.out.println(numero);
            
             //Qual a saída no console ?
        }
               
        
        //Situação 2 - continue
        System.out.println("Resultado situação 2 - continue");

        for(int numero2 = 1; numero2 <=5; numero2 ++){
            if(numero2 == 3)
                continue;
            
                      
            System.out.println(numero2);
            
        }
    
        }
}
