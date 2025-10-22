import java.text.MessageFormat;
class Invoice {
    private String partnum;
    private String partdesc;
    private int quantity;
    private double price;
    public Invoice(
        String pn,
        String pd,
        int q,
        double p
    ){
        partnum=pn;
        partdesc=pd;
        quantity=q>0?q:0;
        price=p>0.0?p:0.0;
    }
    public double getInvoiceAmount(){return price*quantity>0.0?price*quantity:0.0;}
    public double getPrice(){return price;}
    public void setPrice(double p){price=p>0.0?p:0.0;}
    public int getQuantity(){return quantity;}
    public void setQuantity(int q){quantity=q>0?q:0;}
    public String getPartNum(){return partnum;}
    public void setPartNum(String pn){partnum=pn;}
    public String getPartDesc(){return partdesc;}
    public void setPartDesc(String pd){partdesc=pd;}
    public String toString(){
        return(MessageFormat.format(
            "Part Number: {0}\nDescription: {1}\nQuantity: {2}\nPrice: {3}\nInvoice amount: {4}",
            partnum,partdesc,quantity,price,price*quantity
        ));}
}