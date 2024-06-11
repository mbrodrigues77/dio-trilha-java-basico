public class PlanoOperadora {
    public static void main(String[] args) {
        // Modo condicional convencional
        String plano1 = "M"; //M / T
		
		if(plano1 == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano1 == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		}else if(plano1 == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");
        }

        // Modo condicional switch/case
        String plano2 = "T"; // M / T

		switch (plano2) {
			case "T": {
				System.out.println("5Gb Youtube");
                break;
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
                break;
			}
			case "B": {
				System.out.println("100 minutos de ligação");
                break;
			}
        }
}
}
