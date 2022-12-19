public class Main {
    public static void main(String[] args) throws Exception {
        
        invoice inv = new invoice(1 , "MousePad"  ,-10 , 50.0f);

        System.out.println("Valor Total = " + inv.getInvoiceAmount());
    }
}
