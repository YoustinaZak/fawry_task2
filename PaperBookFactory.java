public class PaperBookFactory implements BookFactory {
    @Override
    public Book createBook(String title, String author, String publisher, String ISBN){
        return new ConcretePaperBook(title,author,publisher,ISBN);
    }
}
