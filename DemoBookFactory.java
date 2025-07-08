public class DemoBookFactory implements BookFactory {
    @Override
    public Book createBook(String title, String author, String publisher, String ISBN){
        return new ConcreteDemoBook(title,author,publisher,ISBN);
    }
}
