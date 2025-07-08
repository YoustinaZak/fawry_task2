public class ConcretePaperBook extends Book implements Shippable {
    int price;
    int publishYear;
    int stock;
    //static int stock;

    ConcretePaperBook(String title, String author, String publisher, String ISBN){
        super(title, author, publisher,ISBN);
    }
    void setPrice (int price){
        this.price=price;
    }
    void setPublishYear(int publishYear){
        this.publishYear= publishYear;
    }
    void setStock(int stock){
        this.stock= stock;
    }
    @Override
    public void shipTo (String address){
        //sent to shipping service
        System.out.println("Shipping...");
    }
}
