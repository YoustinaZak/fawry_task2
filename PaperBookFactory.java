public class PaperBookFactory implements BookFactory {
    public Book createBook(){
        return new PaperBookFactory();
    }
}
