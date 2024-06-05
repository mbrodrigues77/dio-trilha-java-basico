public class Operadores {
    public static void main(String[] args){
        /*
        // ARITIMETICOS
        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" +" "+ "JAVA";
        System.out.println(nomeCompleto);

        //qual o resultado das expressoes abaixo?
        String concatenacao ="?";
        
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        //UNÁRIOS
        //classe Operadores.java
        int numero = 5;
		
        //Imprimindo o numero negativo
        System.out.println(- numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        //ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);
        */
        

        //TERNÁRIO

        // classe Operadores.java
        int a, b;

        a = 5;
        b = 6;

       String resultado = " ";

        //EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        
        System.out.println(resultado);
        

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado);
    }
}
