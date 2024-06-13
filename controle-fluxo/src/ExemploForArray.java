public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
        
        //Situação 1 - For position
        //em arrays o indice inicia com zero
        for (int x=0; x < alunos.length; x++) {
            
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        //Situação 2 - For Each
        //Forma abreviada
        String alunos2[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

	    for(String aluno2 : alunos2) {
            
            System.out.println("Nome do aluno é: " + aluno2);
      }
         
}
}
