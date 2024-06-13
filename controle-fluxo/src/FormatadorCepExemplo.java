public class FormatadorCepExemplo {
    public static void main (String [] args) {
        try{
            String cepFormatado = formatarCep ("2376506");
            System.out.println(cepFormatado);             
        } catch (CepInvalidoException e) {
            //e.printStackTrace();
            System.out.println("O CEP não corressponde com as regra de negócio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
