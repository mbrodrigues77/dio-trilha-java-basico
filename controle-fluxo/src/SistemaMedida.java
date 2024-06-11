public class SistemaMedida {
    public static void main(String[] args) {
        // Modo condicional if/else
        String sigla1 = "G";

		if(sigla1 == "P")
			System.out.println("PEQUENO");
		else if(sigla1 == "M")
			System.out.println("MÉDIO");
		else if(sigla1 == "G")
			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO");

        // Modo condicional switch / case
        String sigla2 = "M";

		switch (sigla2) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
    }
}
