class InvoiceTest {
    public static void main(String[] args) {
        Invoice inv1=new Invoice(
            "1234", 
            "Hammer", 
            2, 
            14.95
        );
        System.out.println("\nOriginal Invoice Information");
        System.out.println(inv1);
        inv1.setPartNum("001234");
        inv1.setPartDesc("Yellow Hammer");
        inv1.setQuantity(3);
        inv1.setPrice(19.49);
        System.out.println("\nUpdated Invoice Information");
        System.out.println(inv1);

        Invoice inv2=new Invoice(
            "5678", 
            "Paint Brush", 
            0, 
            0.00
        );
        System.out.println("\nOriginal Invoice Information");
        System.out.println(inv2);
        inv2.setPartNum("1678");
        inv2.setPartDesc("Paint Brush");
        inv2.setQuantity(3);
        inv2.setPrice(9.49);
        System.out.println("\nUpdated Invoice Information");
        System.out.println(inv2);
    }
}