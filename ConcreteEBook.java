public class ConcreteEBook extends Book implements Emailable {
    int price;
    int publishYear;
    String filetype;

    ConcreteEBook(String title, String author, String publisher, String ISBN){
        super(title, author, publisher,ISBN);
    }
    void setPrice (int price){
        this.price=price;
    }
    void setPublishYear (int publishYear){
        this.publishYear= publishYear;
    }
    void setFileType(String filetype){
        this.filetype= filetype;
    }
    @Override
    public void sendTo (String email){
        //sent to Mailing service
    }
}
