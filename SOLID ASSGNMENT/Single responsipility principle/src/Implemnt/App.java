package Implemnt;

public class App {
    public static void main(String[] args) {
        java.util.Date date=new java.util.Date();
        Invoice invoice=new Invoice(11,date);
        invoice.add();
        invoice.delete();

    }
}
