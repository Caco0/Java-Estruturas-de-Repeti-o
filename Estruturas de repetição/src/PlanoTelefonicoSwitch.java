public class PlanoTelefonicoSwitch {
    public static void main(String[] args) {
        String plano = "T"; // M / T / B

        switch ( plano ) {
            case "T": {
                System.out.println("5Gb de Internet");   
            }

            case "M": {
                System.out.println("WhatsApp e Instagram grátis");
            }
            
            case "B":{
                System.out.println("100 minutos de ligação");
            }
                      
            default:
                break;
        }
    }
}
