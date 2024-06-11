public class ResultadoEscolar {
    public static void main(String[] args) {
        /*int nota = 4;
       
       if(nota >= 7)
        System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
        System.out.println("Prova de Recuperação");

       else
        System.out.println("Reprovado");
        */

        // Condições Ternárias
        //Cenário 1
        int nota1 = 7;
		String resultado1 = nota1 >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado1);


        //Cenário 2
        int nota2 = 6;
		String resultado2 = nota2 >=7 ? "Aprovado" : nota2 >=5 && nota2 <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado2);
    }
    
}
