public class EBookFactory implements BookFactory{
    public Book createBook(){
        return new EBookFactory();
    }
}
