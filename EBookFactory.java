public class EBookFactory implements BookFactory{
    @Override
    public Book createBook(String title, String author, String publisher, String ISBN){
        return new ConcreteEBook(title,author,publisher,ISBN);
    }
}
