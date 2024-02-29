public class SistemaDeMedida {
    public static void main(String[] args) {
        String sigla = "A";

        if (sigla == "P") {
            System.out.println("Pequeno");

        }else if (sigla == "M") {
            System.out.println("Médio");

        }else if (sigla == "G") {
            System.out.println("Grande");
            
        }else {
            System.out.println("Indefinido!");
        }
    }
}
