public class PlanoTelefonico {
    public static void main(String[] args) {
        // sistema com if else

        String plano = "M"; //M / T

        if (plano == "B") {
            System.out.println("100 Minutos de Ligação");
            
        }else if (plano == "M") {
            System.out.println("100 Minutos de ligação");
            System.out.println("WhatsApp e Instagram gratis");
        }else if (plano =="t") {
            System.out.println("100 Minutos de ligação");
            System.out.println("WhatsApp e Instagram gratis");
            System.out.println("5GB de Internet");
        }
    }
}
